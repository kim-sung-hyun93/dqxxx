package oop.chap06.constructor;

public class AccountTest {
	public static void main(String[] args) {
		//��ü ����
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		
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
