package net.ssjp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.ssjp.model.*;
/**
 */
public class CreateData {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Hersteller h = new Hersteller();
		h.setName("test");
		h.setCountry("DE");
		session.save(h);
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
	}

}