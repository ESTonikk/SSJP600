package net.ssjp.login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import net.ssjp.usermanagement.User;
import sun.misc.Launcher;

public class JaasAuthentication {
	private User user;
	private String username;
	private String password;
	public JaasAuthentication(User usr, String user, String password){
		this.setUser(usr);
		this.setUsername(username);
		this.setPassword(password);
	}
	
	public boolean login(){
		System.setProperty("java.security.auth.login.config", "jaas.config");
		try{
			MyCallbackHandler mch = new MyCallbackHandler(user, this.getUsername(), this.getPassword());
			LoginContext lc = new LoginContext("Login", mch);
			lc.login();
			return true;
		}catch(LoginException e){
			e.printStackTrace();
		}
		return false;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
