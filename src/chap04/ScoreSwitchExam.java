package chap04;

import java.util.Scanner;

//Switch예제 - 학점평가
public class ScoreSwitchExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = key.nextInt();
		if (score >= 0 && score <= 100) {
			switch(score / 10) {
				case 10 :
				case 9 :
					System.out.println("A");
					break;
				case 8 :
					System.out.println("B");
					break;
				case 7 :
					System.out.println("C");
					break;
				case 6 :
					System.out.println("D");
					break;
				default :
					System.out.println("F");
			}
		} else {
			System.out.println("잘못입력");
		}
	}
}