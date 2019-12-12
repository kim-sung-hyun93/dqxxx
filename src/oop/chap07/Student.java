package oop.chap07;

public class Student extends Person{
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
			
	}
	
	public Student (String name, int age, int korean, int english, int math, int science) {
		super(name, age); // �θ��� private ����� ���� ���������� �ʰ�, �����ڸ� ȣ���Ͽ� ���� !!
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
		String grade = ""; // string���� �ʱ�ȭ
		if (90 <= avg) {
			grade = "A����";
		} else if (70 <= avg) {
			grade = "B����";
		} else if (50 <= avg) {
			grade = "C����";
		} else if (30 <= avg) {
			grade = "D����";
		} else {
			grade = "F����";
		}
		return grade;
	}
	
	public void print() {
		super.print(); //�θ�Ŭ������ PersonŬ������ print�޼ҵ带 ȣ��
		System.out.println("\t\t���:"+getAvg()+
				"\t\t����:"+getGrade());
	}
	
	public static void show() {
		System.out.println("==========================");
	}
}
