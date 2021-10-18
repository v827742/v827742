package first_level_cache;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
		Session s=HibernateUtil.getsessionfactory().openSession();
		
		Student stu=s.load(Student.class, 3);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
		
		Student stu1=s.load(Student.class, 3);
              System.out.println(stu1.getRollno());
              System.out.println(stu1.getName());
              System.out.println(stu1.getAddr());
              

      		Session s1=HibernateUtil.getsessionfactory().openSession();
      		   

    		Student stu2=s1.get(Student.class, 3);
                  System.out.println(stu2.getRollno());
                  System.out.println(stu2.getName());
                  System.out.println(stu2.getAddr());
              
	}

}
