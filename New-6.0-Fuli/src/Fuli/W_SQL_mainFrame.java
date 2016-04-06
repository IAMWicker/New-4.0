package Fuli;

public class W_SQL_mainFrame {
		private int CS;
		private float P;
		private float i;
		private float n;
		private float A;
		private float F;
		public W_SQL_mainFrame() {
			super();
			// TODO Auto-generated constructor stub
		}
		public W_SQL_mainFrame(int CS, double P, double i,double n,double A,double F) {
			super();
			this.CS = CS;
			this.P = (float) P;
			this.i = (float) i;
			this.n = (float) n;
			this.A = (float) A;
			this.F = (float) F;
		}
		public int getCS() {
			return CS;
		}
		public void setCS(int CS) {
			this.CS = CS;
		}
		public float getP() {
			return P;
		}
		public void setP(double P) {
			this.P = (float) P;
		}
		public float geti() {
			return i;
		}
		public void seti(double i) {
			this.i = (float) i;
		}
		public float getn() {
			return n;
		}
		public void setn(double n) {
			this.n = (float) n;
		}
		public float getA() {
			return A;
		}
		public void setA(double A) {
			this.A = (float) A;
		}
		public float getF() {
			return F;
		}
		public void setF(double F) {
			this.F = (float) F;
		}
}
