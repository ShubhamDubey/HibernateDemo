package com.niit.a.hibernetdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookDao {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		Transaction t = ses.beginTransaction();

		Book b1 = new Book();

		b1.setBookId(1);
		b1.setBookName("JAVA");
		b1.setPrice(100);
		b1.setAuthor("SD");

		ses.save(b1);
		t.commit();
		System.out.println("Successfully Saved");

		ses.close();
		sf.close();

	}

}
