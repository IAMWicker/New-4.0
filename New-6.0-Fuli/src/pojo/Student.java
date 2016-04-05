package pojo;

public class Student {
	private String sid;
	private String sname;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sid, String sname, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age
				+ "]";
	}
	
}
