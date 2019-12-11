package chap04;

// if문을 중첩해서 사용하는 연습 - gender와 age를 판단해서 결과를 출력하는 예제
import java.util.Scanner;

// ctrl + shift + f => 코드를 정리
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("성별을 입력하세요:");
		int gender = key.nextInt();

		System.out.print("나이를 입력하세요:");
		int old = key.nextInt();

		if ((gender % 2) == 1) {
			if (old < 20) {
				System.out.println("청소년남자");
			} else {
				System.out.println("성인남자");
			}
		} else {
			if (old < 20) {
				System.out.println("청소년여자");
			} else {
				System.out.println("성인여자");
			}
		}
	}

}
//성별과 나이를 입력 받아서 다음과 같이 출력하기
//[출력형태]
//입력값 1,3은 남자 , 2,4는 여자
//나이 : 1~19 = 청소년, 20~= 성인
//[출력형태]
//성별3과 나이20을 입력한 경우 
//"성인남자"
//성별4와 나이 14를 입력한 경우
//"청소년여자"