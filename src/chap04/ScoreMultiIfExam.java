package chap04;

import java.util.Scanner;

//mutlitif예제 - 학점평가
public class ScoreMultiIfExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = key.nextInt();
		if (score >= 0 && score <= 100) {
			if (score >= 90) { // 위에서 이미 걸러냈으니까, 하나의 조건만 주면 된다! &&가 불필요하다!
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
			System.out.println("잘못입력");
		}
	}
}