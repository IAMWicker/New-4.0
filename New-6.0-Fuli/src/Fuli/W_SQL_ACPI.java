package Fuli;

public class W_SQL_ACPI {
		private int CS;
		private float a;
		private float i;
		private float n;
		private float l;
		private float Y;
		private float b;
		private float Z;
		public W_SQL_ACPI() {
			super();
			// TODO Auto-generated constructor stub
		}
		public W_SQL_ACPI(int CS, double a, double i,double n,double l,double Y,double b,double Z) {
			super();
			this.CS = CS;
			this.a = (float) a;
			this.i = (float) i;
			this.n = (float) n;
			this.l = (float) l;
			this.Y = (float) Y;
			this.b = (float) b;
			this.Z = (float) Z;
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
		public float getl() {
			return l;
		}
		public void setl(double l) {
			this.l = (float) l;
		}
		public float getY() {
			return Y;
		}
		public void setY(double Y) {
			this.Y = (float) Y;
		}
		public float getb() {
			return b;
		}
		public void setb(double b) {
			this.b = (float) b;
		}
		public float getZ() {
			return Z;
		}
		public void setZ(double Z) {
			this.Z = (float) Z;
		}
}
