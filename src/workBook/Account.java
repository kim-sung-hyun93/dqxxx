package workBook;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		/*double calInter = 0.0;
		calInter = (this.balance * interestRate)/100.0;
		return calInter;*/
		
		return balance*interestRate/100;
	}
	
	public void deposit(int dep) {
		this.balance =balance + dep;
	}
	
	public void withdraw(int wit) {
		this.balance = balance - wit;
	}

	public void print() {
		System.out.println("°èÁÂÁ¤º¸:"+getAccount()+"\tÇöÀçÀÜ¾×:"+getBalance());
	}
	
}
