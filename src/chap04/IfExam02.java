package chap04;

// if���� ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ����ϴ� ����
import java.util.Scanner;

// ctrl + shift + f => �ڵ带 ����
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int gender = key.nextInt();

		System.out.print("���̸� �Է��ϼ���:");
		int old = key.nextInt();

		if ((gender % 2) == 1) {
			if (old < 20) {
				System.out.println("û�ҳⳲ��");
			} else {
				System.out.println("���γ���");
			}
		} else {
			if (old < 20) {
				System.out.println("û�ҳ⿩��");
			} else {
				System.out.println("���ο���");
			}
		}
	}

}
//������ ���̸� �Է� �޾Ƽ� ������ ���� ����ϱ�
//[�������]
//�Է°� 1,3�� ���� , 2,4�� ����
//���� : 1~19 = û�ҳ�, 20~= ����
//[�������]
//����3�� ����20�� �Է��� ��� 
//"���γ���"
//����4�� ���� 14�� �Է��� ���
//"û�ҳ⿩��"