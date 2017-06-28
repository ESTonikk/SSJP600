package net.ssjp.usermanagement.dto;

public class UserDTO {
	private String userName;
	private String password1;
	private String password2;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getPassword1() {
		// TODO Auto-generated method stub
		return password1;
	}
	public String getPassword2() {
		// TODO Auto-generated method stub
		return password2;
	}
	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}
}
