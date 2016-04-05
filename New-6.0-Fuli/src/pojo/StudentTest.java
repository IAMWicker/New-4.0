package pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Student;

public class StudentTest {
	
	public static void main(String args[]){
		Student stu = new Student();
		stu.setSid("3");
		stu.setAge(25);
		stu.setSname("¿Óª›Ã√");
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(stu);
		session.getTransaction().commit();
		session.close();	
		sf.close();
	}
}
