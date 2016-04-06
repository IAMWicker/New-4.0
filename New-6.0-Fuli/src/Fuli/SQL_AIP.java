package Fuli;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SQL_AIP {
	public static void write(double a,double x,double n,double M){
		int CS = 0;
		W_SQL_AIP WS=new W_SQL_AIP();
		
		if(WS.getCS()==0)
			CS++;
		WS.setCS(CS);
		WS.seta(a);
		WS.setM(M);
		WS.setn(n);
		WS.setx(x);
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