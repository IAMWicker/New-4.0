package Fuli;

public class W_SQL_API{
		private int CS;
		private float a;
		private float x;
		private float n;
		private float M;
		public W_SQL_API() {
			super();
			// TODO Auto-generated constructor stub
		}
		public W_SQL_API(int CS, double a, double x,double n,double M) {
			super();
			this.CS = CS;
			this.a = (float) a;
			this.x = (float) x;
			this.n = (float) n;
			this.M = (float) M;
		}
		public int getCS() {
			return CS;
		}
		public void setCS(int CS) {
			this.CS = CS;
		}
		public float geta() {
			return a;
		}
		public void seta(double a) {
			this.a = (float) a;
		}
		public float getx() {
			return x;
		}
		public void setx(double x) {
			this.x = (float) x;
		}
		public float getn() {
			return n;
		}
		public void setn(double n) {
			this.n = (float) n;
		}
		public float getM() {
			return M;
		}
		public void setM(double M) {
			this.M = (float) M;
		}
}
