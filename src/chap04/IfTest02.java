package chap04;

import java.util.Scanner;
//if-else���� Scanner
public class IfTest02 {
	public static void main(String[] args) {
		//scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ� 
		//90�̸��̸� "�����"�� ����ϼ���.
		
		Scanner key = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		int input = key.nextInt();
		
		if(input >= 90) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
	}

}
