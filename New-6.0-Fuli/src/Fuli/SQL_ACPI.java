package Fuli;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SQL_ACPI {
	public static void write(double a,double i,double n,double l,double Z,double Y,double b){
		int CS = 0;
		W_SQL_ACPI WS=new W_SQL_ACPI();

		if(WS.getCS()==0)
			CS++;
		WS.setCS(CS);
		WS.seta(a);
		WS.setb(b);
		WS.seti(i);
		WS.setl(l);
		WS.setn(n);
		WS.setY(Y);
		WS.setZ(Z);
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
