package workBook;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccount("441-0290-1203");
		acc.setBalance(500000);
		acc.setInterestRate(7.3);
		
		// account�� �⺻���� ���
		acc.print();
		
		// account�� 20000�� �Ա�
		acc.deposit(20000);
		
		// account �������� ���
		acc.print();
		
		// ���� ���
		System.out.println("����:"+acc.calculateInterest());
	}
}
