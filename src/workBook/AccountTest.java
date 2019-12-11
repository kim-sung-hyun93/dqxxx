package workBook;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccount("441-0290-1203");
		acc.setBalance(500000);
		acc.setInterestRate(7.3);
		
		// account에 기본정보 출력
		acc.print();
		
		// account에 20000원 입금
		acc.deposit(20000);
		
		// account 변경정보 출력
		acc.print();
		
		// 이자 출력
		System.out.println("이자:"+acc.calculateInterest());
	}
}
