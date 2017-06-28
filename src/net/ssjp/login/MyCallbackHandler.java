package net.ssjp.login;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

import net.ssjp.usermanagement.User;

public class MyCallbackHandler implements CallbackHandler {
	User usr;
	String name;
	String password;
	public MyCallbackHandler(User usr, String username, String password) {
		this.setUsr(usr);
		this.setName(username);
		this.setPassword(password);
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		System.out.println("Callback Handler - handle called");
		for (int i = 0; i < callbacks.length; i++) {
			if (callbacks[i] instanceof NameCallback) {
				NameCallback nameCallback = (NameCallback) callbacks[i];
				nameCallback.setName(name);
			} else if (callbacks[i] instanceof PasswordCallback) {
				PasswordCallback passwordCallback = (PasswordCallback) callbacks[i];
				passwordCallback.setPassword(password.toCharArray());
			} else {
				throw new UnsupportedCallbackException(callbacks[i], "The submitted Callback is unsupported");
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUsr() {
		return usr;
	}

	public void setUsr(User usr) {
		this.usr = usr;
	}

}
