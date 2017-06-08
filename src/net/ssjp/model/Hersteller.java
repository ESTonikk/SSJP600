package net.ssjp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hersteller")
public class Hersteller implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1057534802729843031L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private int id;
	
	@Column(name="Name")
	private String Name;
	@Column(name="Streetnumber")
	private int Streetnumber;
	@Column(name="Street")
	private String Street;
	@Column(name="City")
	private String City;
	@Column(name="ZIP")
	private String ZIP;
	@Column(name="Phone")
	private String Phone;
	@Column(name="Fax")
	private String Fax;
	@Column(name="Mail")
	private String Mail;
	@Column(name="ContactPerson")
	private String ContactPerson;
	@Column(name="Country")
	private String country;
	
	public Hersteller( ) {	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getStreetnumber() {
		return Streetnumber;
	}

	public void setStreetnumber(int streetnumber) {
		Streetnumber = streetnumber;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getContactperson() {
		return ContactPerson;
	}

	public void setContactperson(String contactPerson) {
		ContactPerson = contactPerson;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Hersteller [id=" + id + ", Name=" + Name + ", Streetnumber=" + Streetnumber + ", Street=" + Street
				+ ", City=" + City + ", ZIP=" + ZIP + ", Phone=" + Phone + ", Fax=" + Fax + ", Mail=" + Mail
				+ ", ContactPerson=" + ContactPerson + ", country=" + country + "]";
	}
	
}
