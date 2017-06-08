package net.ssjp.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.ssjp.model.*;

import javax.persistence.criteria.CriteriaQuery;

/**
 * @author Deepak Kumar Web: http://www.roseindia.net
 */
public class GetAllData {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		
		CriteriaQuery<Employee> cq = session.getCriteriaBuilder().createQuery(Employee.class);
		cq.from(Employee.class);
		List<Employee> employeeList = session.createQuery(cq).getResultList();

		for (Employee employee : employeeList) {
			System.out.println("ID: " + employee.getId());
			System.out.println("Name: " + employee.getEmpName());
		}  
		

		tr.commit();
		System.out.println("Data printed");
		sessFact.close();
	}
}