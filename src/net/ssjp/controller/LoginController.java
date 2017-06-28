package net.ssjp.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ManagedBean(name="loginController")
@SessionScoped
public class LoginController {
	private String username, password;
	
	public LoginController(){
		getSession().invalidate();
	}
	
	public String login(){
		try{
			HttpServletRequest request = getRequest();
		
			log("login" + username);
			System.out.println("login "+username);
			request.login(this.username, this.password);
			if(request.isUserInRole("ADMIN"))
				return "admin";
			if(request.isUserInRole("USER"))
				return "user";
			if(request.isUserInRole("ANON"))
				return "anon";
		}catch(Exception e){
			e.printStackTrace();
			log("User "+username + " not able to log in", e);
			getContext().addMessage(null, new FacesMessage("Login failed."));
			getContext().addMessage(null, new FacesMessage(e.toString()));
			return "failure";
		}
		return "success";
	}
	
	public String logout(){
		if(getSession() != null){
			try{
				getRequest().logout();
			}catch(ServletException e){
				log("Error on logout", e);
			}
		}
		return "logout";
	}
	
	private HttpSession getSession() {
		return(HttpSession) getContext().getExternalContext().getSession(true);
	}
	private FacesContext getContext() {
		return FacesContext.getCurrentInstance();
	}
	private HttpServletRequest getRequest() {
		return (HttpServletRequest) getContext().getExternalContext().getRequest();
	}
	private void log(String message){
		log(message, null);
	}
	private void log(String message, Throwable t){
		if(t!=null)
			getContext().getExternalContext().log(message, t);
		else
			getContext().getExternalContext().log(message);
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
