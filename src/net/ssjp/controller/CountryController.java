package net.ssjp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.ssjp.main.HibernateUtil;
import net.ssjp.model.Country;

@ManagedBean(name="countryController")
@ViewScoped
public class CountryController {
	private static List<Country> countryList;
	
	public static List<Country> getCountries(){
		System.out.println("getcountries!");
		if(countryList==null){
			countryList= new ArrayList<Country>();
			getCountryList();
		}
		
		return countryList;
	}
	
	private static void getCountryList(){
		System.out.println("loading countries");
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr;
		if(!session.getTransaction().isActive()){
			tr = session.beginTransaction();
		}else{
			tr = session.getTransaction();
		}
		
		CriteriaQuery<Country> cq = session.getCriteriaBuilder().createQuery(Country.class);
		cq.from(Country.class);
		countryList = session.createQuery(cq).getResultList();
		tr.commit();
	}
}
