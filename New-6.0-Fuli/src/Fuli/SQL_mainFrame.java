package Fuli;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SQL_mainFrame {
	public static void write(double P,double i,double n,double A,double F){
		int CS = 0;
		W_SQL_mainFrame WS=new W_SQL_mainFrame();
		WS.setA(A);
		if(WS.getCS()==0)
			CS++;
		WS.setCS(CS);
		WS.setF(F);
		WS.seti(i);
		WS.setn(n);
		WS.setP(P);
		Configuration  cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(WS);
		session.getTransaction().commit();
		session.close();	
		sf.close();
		
	}

}
