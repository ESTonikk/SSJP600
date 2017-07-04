package net.ssjp.usermanagement;

import java.util.ArrayList;
import java.util.List;
 
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.ssjp.controller.UserController;
import net.ssjp.usermanagement.dto.UserDTO;
 

 
@Produces(MediaType.TEXT_PLAIN)
@Stateless
public class UserManagementService {
 
    private UserController userController;
 
    public String ping() {
        return "alive";
    }

    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@FormParam("email") String username, @FormParam("password") String password,
            @Context HttpServletRequest req) {
         
        JsonResponse json = new JsonResponse();
         
        //only login if not already logged in...
        if(req.getUserPrincipal() == null){
            try {
                req.login(username, password);
                req.getServletContext().log("Authentication Demo: successfully logged in " + username);
            } catch (ServletException e) {
                e.printStackTrace();
                json.setStatus("FAILED");
                json.setErrorMsg("Authentication failed");
                return Response.ok().entity(json).build();
            }
        }else{
            req.getServletContext().log("Skip logged because already logged in: "+username);
        }
         
        //read the user data from db and return to caller
        json.setStatus("SUCCESS");
         
        User user = userController.find(username);
        req.getServletContext().log("Authentication Demo: successfully retrieved User Profile from DB for " + username);
        json.setData(user);
         
        //we don't want to send the hashed password out in the json response
        userController.detach(user);
        user.setPassword(null);
        //user.setGroups(null);
        return Response.ok().entity(json).build();
    }
 
    @Produces(MediaType.APPLICATION_JSON)
    public Response logout(@Context HttpServletRequest req) {
 
        JsonResponse json = new JsonResponse();
 
        try {
            req.logout();
            json.setStatus("SUCCESS");
            req.getSession().invalidate();
        } catch (ServletException e) {
            e.printStackTrace();
            json.setStatus("FAILED");
            json.setErrorMsg("Logout failed on backend");
        }
        return Response.ok().entity(json).build();
    }
 
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public Response register(UserDTO newUser, @Context HttpServletRequest req) {
 
        JsonResponse json = new JsonResponse();
        json.setData(newUser); //just return the date we received
 
        //do some validation (in reality you would do some more validation...)
        //by the way: i did not choose to use bean validation (JSR 303)
        if (newUser.getPassword1().length() == 0 || !newUser.getPassword1().equals(newUser.getPassword2())) {
            json.setErrorMsg("Both passwords have to be the same - typo?");
            json.setStatus("FAILED");
            return Response.ok().entity(json).build();
        }
 /*
        User user = new User(newUser);
 
        List<Group> groups = new ArrayList<Group>();
        groups.add(Group.ADMINISTRATOR);
        groups.add(Group.USER);
        groups.add(Group.DEFAULT);
        user.setGroups(groups);
 */
        //this could cause a runtime exception, i.e. in case the user already exists
        //such exceptions will be caught by our ExceptionMapper, i.e. javax.transaction.RollbackException
       // userController.save(user); // this would use the clients transaction which is committed after save() has finished
        req.getServletContext().log("successfully registered new user: '" + newUser.getUserName() + "':'" + newUser.getPassword1() + "'");
 
        req.getServletContext().log("execute login now: '" + newUser.getUserName() + "':'" + newUser.getPassword1() + "'");
        try {
            req.login(newUser.getUserName(), newUser.getPassword1());
            json.setStatus("SUCCESS");
        } catch (ServletException e) {
            e.printStackTrace();
            json.setErrorMsg("User Account created, but login failed. Please try again later.");
            json.setStatus("FAILED"); //maybe some other status? you can choose...
        }
         
        return Response.ok().entity(json).build();
    }
 
}