package com.theone.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.theone.hibernate.model.Employee;

public class EmployeeDAO {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();// it will helps us to get the configuration to connect DB( hibernate.cfg.xml)

		SessionFactory  factory = cfg.buildSessionFactory();// it hepls us to virtually connect the data base
		Session session= factory.openSession();
		
		Transaction transaction= session.beginTransaction();
		Employee employee=new Employee();
		employee.setId(107);
		employee.setName(" deepak sir  ");
		
		
		Employee employee2 = session.load(Employee.class,101);
		employee2.setName("Qspider");
		session.update(employee2);
		
		//===========Read===========================
		Employee employee3 = session.load(Employee.class,101);
		System.out.println(employee3.getId()+" "+employee.getName());
		
		session.save(employee);
		transaction.commit();
		
		session.close();
		factory.close();
	}

}
