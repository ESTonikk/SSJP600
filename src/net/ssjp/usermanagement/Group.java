package net.ssjp.usermanagement;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "AppGroup")
public class Group implements Serializable
{
    @Id
    private String groupName;

    @ManyToMany
    @JoinTable(name="USER_GROUP",
    joinColumns = @JoinColumn(name = "groupName", 
        referencedColumnName = "groupName"), 
    inverseJoinColumns = @JoinColumn(name = "userName", 
        referencedColumnName = "userName"))
    private List<User> users;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}