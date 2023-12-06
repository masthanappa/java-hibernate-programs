package com.kn.hb.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Masthan",95000);
		Employee e2 = new Employee(2, "Somu",95000);
		Employee e3 = new Employee(3, "Giri",95000);
		Employee e4 = new Employee(4, "Seenu",95000);
		Employee e5 = new Employee(5, "Avinash",95000);
		
		//1. Configure the hibernate.cfg.xml.file
		Configuration cfg = new Configuration();
		cfg.configure();
		
		// 2.Build SessionFactory using configuration
  SessionFactory factory =cfg.buildSessionFactory();
  
  // 3. Open Session using SessionFactory
     Session session = factory.openSession();
     
     //4. Begin Transaction using session
  Transaction txn = session.beginTransaction();
  session.save(e1);
  session.save(e2);
  session.save(e3);
  session.save(e4);
  session.save(e5);
  
  //5. Commit the Transaction
  txn.commit();
  System.out.println(" has been stored in Database");
//  System.out.println("------>"+ e2 + " has been stored in Database");
//  System.out.println("------>"+ e3 + " has been stored in Database");
//  System.out.println("------>"+ e4 + " has been stored in Database");
//  System.out.println("------>"+ e5 + " has been stored in Database");
	}

}
