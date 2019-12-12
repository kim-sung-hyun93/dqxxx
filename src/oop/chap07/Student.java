package oop.chap07;

public class Student extends Person{
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
			
	}
	
	public Student (String name, int age, int korean, int english, int math, int science) {
		super(name, age); // 부모의 private 멤버를 직접 엑세스하지 않고, 생성자를 호출하여 전달 !!
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
/*	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	*/
	
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		double avg = Math.round((this.korean+this.english+this.math+this.science)/(double)4*10)/10.0;
		return avg;
	}
	public String getGrade() {
		double avg = getAvg();
		String grade = ""; // string변수 초기화
		if (90 <= avg) {
			grade = "A학점";
		} else if (70 <= avg) {
			grade = "B학점";
		} else if (50 <= avg) {
			grade = "C학점";
		} else if (30 <= avg) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		return grade;
	}
	
	public void print() {
		super.print(); //부모클래스인 Person클래스의 print메소드를 호출
		System.out.println("\t\t평균:"+getAvg()+
				"\t\t학점:"+getGrade());
	}
	
	public static void show() {
		System.out.println("==========================");
	}
}
