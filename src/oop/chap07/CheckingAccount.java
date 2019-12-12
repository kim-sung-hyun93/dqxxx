package oop.chap07;

public class CheckingAccount extends Account{
	private String cardNo;

	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(String account, int balance, String ownerName, String cardNo) {
		super(account, balance, ownerName);
		this.cardNo = cardNo;
	}
	//문자열 비교는 무조건 equals를 이용해서 비교한다.
	// == 는 안돼
	public void pay(int amount, String cardNo) {
		if(this.cardNo.equals(cardNo) && getBalance() >= amount) {
			withdraw(amount); //부모클래스의 함수를 내 것처럼 쓸 수 있다!!
		}else {
			System.out.println("지불이 불가능합니다.");
		}
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
