package chap04;

import java.util.Scanner;

//mutlitif���� - ������
public class ScoreMultiIfExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int score = key.nextInt();
		if (score >= 0 && score <= 100) {
			if (score >= 90) { // ������ �̹� �ɷ������ϱ�, �ϳ��� ���Ǹ� �ָ� �ȴ�! &&�� ���ʿ��ϴ�!
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("�߸��Է�");
		}
	}
}