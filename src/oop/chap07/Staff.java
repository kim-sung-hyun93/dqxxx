package oop.chap07;

public class Staff extends Person{
	private String dept;
	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		super.print(); //부모클래스인 Person클래스의 print메소드를 호출
		System.out.println("\t\t부서:"+getDept());
	}
	
}
