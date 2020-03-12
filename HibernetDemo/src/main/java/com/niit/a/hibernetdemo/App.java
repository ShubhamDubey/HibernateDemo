package com.niit.a.hibernetdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		Transaction t = ses.beginTransaction();

		Employee e1 = new Employee();

		e1.setFirstName("Shubham");
		e1.setLastName("Dubey");
		e1.setSalary(10000);

		ses.save(e1);
		t.commit();
		System.out.println("Successfully Saved");

		ses.close();
		sf.close();

	}
}
