package net.ssjp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.ssjp.model.*;
import net.ssjp.services.HerstellerService;
/**
 */
public class CreateData {
	public static void main(String[] args) throws Exception {

		Hersteller h = new Hersteller();
		h.setName("test");
		h.setCountry("DE");
		HerstellerService.save(h);
		System.out.println("Successfully inserted");
	}

}