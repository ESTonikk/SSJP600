package net.ssjp.services;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.ssjp.main.HibernateUtil;
import net.ssjp.model.Hersteller;

public class HerstellerService {
	private static List<Hersteller> herstellerList;
	
	static{
		herstellerList = getHersteller();
	}
	
	
	public static List<Hersteller> getHersteller(){
		if(herstellerList==null){
			initHersteller();
			
		}
		return herstellerList;
	}
	
	public static void save(Hersteller h){
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr;
		if(!session.getTransaction().isActive()){
			tr = session.beginTransaction();
		}else{
			tr = session.getTransaction();
		}
		if(h.getId()<1){
			h.setId((int) session.save(h));
		}else{
			session.save(h);
		}
		if(!getHersteller().contains(h))
			getHersteller().add(h);
		tr.commit();
	}

	private static void initHersteller(){
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		
		CriteriaQuery<Hersteller> cq = session.getCriteriaBuilder().createQuery(Hersteller.class);
		cq.from(Hersteller.class);
		herstellerList = session.createQuery(cq).getResultList();
		tr.commit();
	}

	public List<Hersteller> getHerstellerList() {
		return herstellerList;
	}



	public void setHerstellerList(List<Hersteller> herstellerList) {
		this.herstellerList = herstellerList;
	}
	
}
