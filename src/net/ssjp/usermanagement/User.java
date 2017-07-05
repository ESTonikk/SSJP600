package net.ssjp.usermanagement;

import java.io.Serializable;
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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import net.ssjp.main.HibernateUtil;
import net.ssjp.usermanagement.dto.UserDTO;

@Entity
@Table(name = "AppUsers")
public class User implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
    
    public User(){	}

    @ManyToMany(mappedBy = "users")
    private List<Group> groups;

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
	
	public void setId(long id){
		this.id = id;
	}
	
	public long getId(){
		return this.id;
	}
	public boolean exists(String Username){
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr;
		if(!session.getTransaction().isActive()){
			tr = session.beginTransaction();
		}else{
			tr = session.getTransaction();
		}
		Query query = session.createQuery("from User u where u.username = :username ");
		query.setParameter("username", Username);
		List list = query.list();
		return list.isEmpty();
	}
	public void save(){
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr;
		if(!session.getTransaction().isActive()){
			tr = session.beginTransaction();
		}else{
			tr = session.getTransaction();
		}
		if(this.getId()<1){
			this.setId((long) session.save(this));
		}else{
			session.save(this);
		}
		tr.commit();
	}
}

