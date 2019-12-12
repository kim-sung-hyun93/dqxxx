package oop.chap07;

public class Teacher extends Person{
	private String subject;
	public Teacher() {
		
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public void print() {
		super.print(); //부모클래스인 Person클래스의 print메소드를 호출
		System.out.println("\t\t과목:"+getSubject());
	}
	
	
}
