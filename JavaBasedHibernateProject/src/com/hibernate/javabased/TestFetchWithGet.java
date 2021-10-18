package com.hibernate.javabased;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class TestFetchWithGet {
	public static void main(String[] args) {
		
           Map<String,Object> m=new HashMap<>();
		
		m.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		m.put(Environment.URL, "jdbc:mysql://localhost:3306/testjbh");
		m.put(Environment.USER,"root");
		m.put(Environment.PASS, "root");
		m.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		m.put(Environment.HBM2DDL_AUTO, "update");
		m.put(Environment.SHOW_SQL, "true");
		
		
		StandardServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(m).build();
		MetadataSources mds=new MetadataSources(reg);
		mds.addAnnotatedClass(Student.class);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Student stu=s.get(Student.class, 1);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
