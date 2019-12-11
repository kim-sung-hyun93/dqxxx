package workBook;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
		
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
		System.out.println(getName()+" ���:"+getAvg()+"\t"+"����:"+getGrade());
	}
	

}
