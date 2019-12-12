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
	//���ڿ� �񱳴� ������ equals�� �̿��ؼ� ���Ѵ�.
	// == �� �ȵ�
	public void pay(int amount, String cardNo) {
		if(this.cardNo.equals(cardNo) && getBalance() >= amount) {
			withdraw(amount); //�θ�Ŭ������ �Լ��� �� ��ó�� �� �� �ִ�!!
		}else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
