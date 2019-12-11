package chap04;

import java.util.Scanner;
//숫자를 입력받아서 음수인지 양수인지 출력하기. 단, 양수인 경우에는 짝수인지 홀수인지 출력하기
//[출력형태](음수)
//____는 음수입니다.
//[출력형태](양수)
//____은 짝수 입니다.
//
public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int input = key.nextInt();
				
		if(input < 0){
			System.out.println(input+"은 음수입니다");
		}else{
			if((input%2) == 1){
				System.out.println(input+"은 홀수입니다");
			}else{
				System.out.println(input+"은 짝수입니다");
			}
		}
	}

}
