package chap04;

import java.util.Scanner;
//���ڸ� �Է¹޾Ƽ� �������� ������� ����ϱ�. ��, ����� ��쿡�� ¦������ Ȧ������ ����ϱ�
//[�������](����)
//____�� �����Դϴ�.
//[�������](���)
//____�� ¦�� �Դϴ�.
//
public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int input = key.nextInt();
				
		if(input < 0){
			System.out.println(input+"�� �����Դϴ�");
		}else{
			if((input%2) == 1){
				System.out.println(input+"�� Ȧ���Դϴ�");
			}else{
				System.out.println(input+"�� ¦���Դϴ�");
			}
		}
	}

}
