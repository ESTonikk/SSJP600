package net.ssjp.usermanagement;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.codec.digest.DigestUtils;

import net.ssjp.usermanagement.dto.UserDTO;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="user_id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	@ElementCollection(targetClass = Group.class)
	@CollectionTable(name="USERS_GROUPS",
					joinColumns = @JoinColumn(name = "email", nullable=false),
					uniqueConstraints = { @UniqueConstraint(columnNames={"email", "groupname"})})
	@Enumerated(EnumType.STRING)
	@Column(name="groupname", length=64, nullable=false)
	private List<Group> groups;
	
	
	
	public User(UserDTO user){
		if(user.getPassword1()==null || user.getPassword1().length() == 0 || !user.getPassword1().equals(user.getPassword2()))
			throw new RuntimeException("Password1 and Password2 müssen gleich sein!");
		this.username = user.getUserName();
		this.password = DigestUtils.sha512Hex(user.getPassword1());
	}
	
	public User(String username) {
		this.setUsername(username);
		
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

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	
	public List<Group> getGroups(){
		return this.groups;
	}
}
