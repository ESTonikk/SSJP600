package net.ssjp.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.commons.codec.digest.DigestUtils;
import org.primefaces.context.RequestContext;

import net.ssjp.login.JaasAuthentication;
import net.ssjp.usermanagement.User;
 

@SessionScoped
@ManagedBean(name="userLoginView")
public class UserLoginView {
     
	 private String username;
     
    private String password1;
    
    private String password2;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword1() {
        return password1;
    }
 
    public void setPassword1(String password) {
        this.password1 = password;
    }
    
    public String register(ActionEvent event){
    	String site = "";
    	return site; 
    }
   
    public String login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        String site;
        User usr = new User();
        usr.setUsername(this.getPassword1());
        if(this.getPasswordHex() == usr.getPassword()) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", this.getUsername());
            site = "main.xhtml?faces-redirect=true";
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
            site = "login.xhtml?faces-redirect=true";
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        return site;
    }

	private String getPasswordHex() {
		return DigestUtils.sha512Hex(this.getPassword1());
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}   
}