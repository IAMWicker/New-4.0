package Fuli;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;


public class SQL_mainFrame {
	public static void write(int CS,double P,double i,double n,double A,double F){
		
		W_SQL_mainFrame WS=new W_SQL_mainFrame();
		WS.setA(A);
		try{
		WS.setCS(CS);
		WS.setF(F);
		WS.seti(i);
		WS.setn(n);
		WS.setP(P);}
		catch(Exception e){
		CS++;
		WS.setCS(CS);
		WS.setF(F);
		WS.seti(i);
		WS.setn(n);
		WS.setP(P);
		}
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(WS);
		session.getTransaction().commit();
		session.close();	
		sf.close();
	
		
	}
	public static String readF()
	{
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		String a=session.createSQLQuery("SELECT F FROM Fuli_User_mainFrame").list().toString();

		
		return a;
	}
	public static String readi()
	{
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		String a=session.createSQLQuery("SELECT i FROM Fuli_User_mainFrame").list().toString();
		
		return a;
	}
	
	public static double readn()
	{
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		List a=session.createSQLQuery("SELECT n FROM Fuli_User_mainFrame").list();
		Object[] obj = (Object[]) a.get(0);
		double n=Double.parseDouble(obj[0].toString());;
		return n;
	}
	public static double readA()
	{
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		List a=session.createSQLQuery("SELECT A FROM Fuli_User_mainFrame").list();
		Object[] obj = (Object[]) a.get(0);
		double A=Double.parseDouble(obj[0].toString());;
		return A;
	}
	public static double readP()
	{
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		List a=session.createSQLQuery("SELECT P FROM Fuli_User_mainFrame").list();
		Object[] obj = (Object[]) a.get(0);
		double P=Double.parseDouble(obj[0].toString());;
		return P;
	}
}
