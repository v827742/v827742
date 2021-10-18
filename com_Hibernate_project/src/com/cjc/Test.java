package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Test {
	
	public static void main(String args[])
	{
		StandardServiceRegistry reg=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(reg);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		
		Session s=sf.openSession();
		
		Student stu=new Student();
		stu.setRollno(6);
		stu.setAge(26);
		stu.setName("Shivraj");
		stu.setAddr("mumbai");
		
	
		s.save(stu);
		
		s.beginTransaction().commit();
		
	}

}
