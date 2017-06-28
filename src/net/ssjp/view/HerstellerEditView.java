package net.ssjp.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import javax.faces.model.SelectItem;
import net.ssjp.controller.CountryController;
import net.ssjp.model.Country;
import net.ssjp.model.Hersteller;
import net.ssjp.services.HerstellerService;

@ManagedBean(name="herstellerEditView")
@ViewScoped
public class HerstellerEditView {
	private static Hersteller hersteller;
	private static List<Country> countryList;
	private static List<String> retList;
	static{
		hersteller = new Hersteller();
		countryList = CountryController.getCountries();
		retList = new ArrayList<String>();
		for(Country c:countryList){
			retList.add(c.getCode());
		}
	}
	
	public String getName(){
		return hersteller.getName();
	}
	public void setName(String name){
		hersteller.setName(name);
	}
	//#{herstellerEditView.name}
	public String getStreet(){
		return hersteller.getStreet();
	}
	public void setStreet(String street){
		hersteller.setStreet(street);
	}
	//#{herstellerEditView.street}
	public int getStreetnumber(){
		return hersteller.getStreetnumber();
	}
	public void setStreetnumber(int street){
		hersteller.setStreetnumber(street);
	}
	//#{herstellerEditView.streetnumber}
	public String getCity(){
		return hersteller.getCity();
	}
	public void setCity(String city){
		hersteller.setCity(city);
	}
	//#{herstellerEditView.city}
	public String getZIP(){
		return hersteller.getZIP();
	}
	public void setZIP(String ZIP){
		hersteller.setZIP(ZIP);
	}
	//#{herstellerEditView.ZIP}
	public String getPhone(){
		return hersteller.getPhone();
	}
	public void setPhone(String phone){
		hersteller.setPhone(phone);
	}
	//#{herstellerEditView.phone}
	public String getFax(){
		return hersteller.getFax();
	}
	public void setFax(String fax){
		hersteller.setFax(fax);
	}
	//#{herstellerEditView.fax}
	public String getMail(){
		return hersteller.getMail();
	}
	public void setMail(String mail){
		hersteller.setCity(mail);
	}
	//#{herstellerEditView.mail}
	public String getContactperson(){
		return hersteller.getContactperson();
	}
	public void setContactperson(String contactperson){
		hersteller.setContactperson(contactperson);
	}
	//#{herstellerEditView.contactperson}
	public String getCountry(){
		return hersteller.getCountry();
	}
	public void setCountry(String country){
		hersteller.setCountry(country);
	}
	//#{herstellerEditView.country}
	public List<String> getCountries(){
		
		return retList;
	}
	
	public void setCountries(){
		
	}
	//#{herstellerEditView.countries}
	public void submit(){
		//TODO implementieren
		HerstellerService.save(getHersteller());
		hersteller = new Hersteller();
	}
	public Hersteller getHersteller() {
		return hersteller;
	}
	public static void setHersteller(Hersteller h) {
		hersteller = h;
	}
}
