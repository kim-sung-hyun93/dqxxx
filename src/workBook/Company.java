package workBook;

public class Company {
	private double salary;
	private double annualIncome;
	private double afterTaxAnnualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {
		
	}
	public Company(double salary) {
		super();
		this.salary = salary;
	}
		
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getAfterTaxAnnualIncome() {
		return afterTaxAnnualIncome;
	}
	public void setAfterTaxAnnualIncome(double afterTaxAnnualIncome) {
		this.afterTaxAnnualIncome = afterTaxAnnualIncome;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAfterTaxBonus() {
		return afterTaxBonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
	public double getIncome() {
		annualIncome = this.salary*12;
		return annualIncome;
	}
	
	public double getAfterTaxIncome() {
		afterTaxAnnualIncome = annualIncome*0.9;
		return afterTaxAnnualIncome;
	}
	
	public double getAnnualBonus() {
		bonus = salary*0.2;
		double totalbonus = bonus*4;
		return totalbonus;
	}
	
	public double getAnnualAfterTaxBonus() {
		afterTaxBonus = getAnnualBonus()*0.945;
		return afterTaxBonus;
	}
	
	public void print() {
		System.out.println("연 기본금 합: "+getIncome()+" 세후:"+getAfterTaxIncome());
	}
	
	public void printbonus() {
		System.out.println("연 보너스 합: "+getAnnualBonus()+" 세후:"+getAnnualAfterTaxBonus());
	}
	
	public void printtotal() {
		System.out.println("연 지급액 합: "+(getAfterTaxIncome()+getAnnualAfterTaxBonus()));
	}
	

}
