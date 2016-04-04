
public class sumofthey {
	public static double M(double a,double x,double n){
		try{
		 double M=(double) (a*(1+x)*(-1+Math.pow(1+x,n))/x);
		return M;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double Z(double a,double i,double l,double n)
	{
		try{
	double Z=(a*(1+i)*Math.pow(1+i,n)/(Math.pow(1+i, n)-1)-a);
	return Z;
	}catch(Exception e){
		return 0;
	}
	}
	public static double B(double a,double i,double l,double n){
		try{
		 double B=(a*(1+i)*Math.pow(1+i,n)/(Math.pow(1+i, n)-1))/n;
		return B;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double Y(double a,double i,double l,double n){
		try{
		 double Y=(a*(1+i)*Math.pow(1+i,n)/(Math.pow(1+i, n)-1));
		return Y;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double F1(double P,double i,double n,double A){
		try{
		 double F=(P*Math.pow(i+1, n));
		return F;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double F2(double P,double i,double n,double A){
		try{
		 double F=(A*(Math.pow((1+i),n)-1)/i);
		return F;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double P1(double F,double i,double n,double A){
		try{
		 double P=(F/Math.pow((1+i),n));
		return P;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double P2(double F,double i,double n,double A){
		try{
		 double P=(A*Math.pow((1+i),n-1)/(i*Math.pow((1+i),n)));
		return P;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double A1(double F,double i,double n,double P){
		try{
		 double A=(F*i/(Math.pow((1+i),n)-1));
		return A;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double A2(double F,double i,double n,double P){
		try{
		 double A=(P*(i*Math.pow(1+i,n))/(Math.pow((1+i),n)-1));
		return A;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double n1(double F,double i,double A,double P){
		try{
		 double n=(Math.log((F/P))/Math.log(1+i));
		return n;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double n2(double F,double i,double A,double P){
		try{
		 double n=(Math.log(F*i/A+1)/Math.log(1+i));
		return n;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double i1(double F,double n,double A,double P){
		try{
		 double i=(StrictMath.pow(n,1.0/(F/P)));
		return i;
		}
		catch(Exception e){
			
			return 0;}
		}
	public static double Vc(double F,double n,double i,double P){
		try{
		 double Vc=(P*(1+i)*(Math.pow((1+i),n)-1)/i);
		return Vc;
		}
		catch(Exception e){
			
			return 0;}
		}
	
}
