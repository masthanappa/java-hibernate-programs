package com.kn.hb.bike;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Student s1= new Student(1, "Masthan", 95);
		Student s2= new Student(2, "Somu", 70);
		Student s3= new Student(3, "Giri", 60);
		
		Bike b1=new Bike(0235, "Royal Enfiled", 8787557);
		Bike b2=new Bike(0236, "KTM", 8787888);
		Bike b3=new Bike(0237, "Hero", 8787566);
		
		Configuration conf = new Configuration();
	      conf.configure();// configure("hibernate.cfg.xml");
	      
	      SessionFactory factory = conf.buildSessionFactory();
	       Session session =factory.openSession();
	      Transaction txn= session.beginTransaction();
	      session.save(s1);
	      session.save(s2);
	      session.save(s3);
	      session.save(b1);
	      session.save(b2);
	      session.save(b3);
	      txn.commit();
	      System.out.println("--------> has been stored in database");
	     
	}

}
