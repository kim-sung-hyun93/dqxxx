package chap04;
import java.util.Scanner;
//switch연습 - 기본문법(MutliIfTest 클래스의 내용을 switch로 변경)
//switch문의 특성을 활용(중복되는 코드 제거)
public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int ssn = key.nextInt();
		switch(ssn) { 
			case 1 :
			case 3 :
				System.out.println("남자");
				break;
			case 2 :
			case 4 :
				System.out.println("여자");
				break;
			default : 
				System.out.println("기타");
		}
	}
}
