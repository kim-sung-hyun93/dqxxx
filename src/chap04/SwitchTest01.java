package chap04;
import java.util.Scanner;
//switch���� - �⺻����(MutliIfTest Ŭ������ ������ switch�� ����)
//switch�� if~else���� ��ü�� �� �ִ� ���
public class SwitchTest01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int ssn = key.nextInt();
		switch(ssn) { // true�� false�� �Ǵ��� �� �ִ� ������ �ƴ϶�, ���� ���� ����� ����/�����/�޼ҵ�ȣ��
			
			case 1 : // ssn������ ����� ���� case������ �� - �� ������ ��� �Ұ�
				System.out.println("����");
				break; // break���� ������ switch��(break�� ���� ��)�� ����������.
			case 2 :
				System.out.println("����");
				break;
			case 3 :
				System.out.println("����");
				break;
			case 4 :
				System.out.println("����");
				break;
			default : // if���� else�� ���� ����
				System.out.println("��Ÿ");
		}
	}
}
