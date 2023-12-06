package org.kodnest.hibernat_demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student(1, "Shyam", 76);
      Configuration conf = new Configuration();
      conf.configure();// configure("hibernate.cfg.xml");
      
      SessionFactory factory = conf.buildSessionFactory();
       Session session =factory.openSession();
      Transaction txn= session.beginTransaction();
      session.save(s1);
      txn.commit();
      System.out.println("---> "+s1+" has been stored in database");
    }
}
   