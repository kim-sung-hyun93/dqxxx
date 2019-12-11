package oop.chap06.constructor;

public class AccountTest {
	public static void main(String[] args) {
		//객체 생성
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		
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
