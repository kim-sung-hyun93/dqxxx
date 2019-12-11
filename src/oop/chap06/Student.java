package oop.chap06;

public class Student {
	private String name;
	private int age;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student(String name, int age, int korean, int english, int math, int science) {
		super(); // 상속 이후로 설명
		this.name = name;
		this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student() {
		
	}
	
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
		double avg = (this.korean+this.english+this.math+this.science)/(double)4;
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
		System.out.println(getName()+" 평균:"+getAvg()+"\t"+"학점:"+getGrade());
	}
	

}
