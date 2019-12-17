package chap08;

import java.util.Scanner;
/*
예외가 발생된 곳에서 예외를 처리하도록 정의
예외가 발생된 곳에서 예외를 처리하면 호출하는 곳에서는 어떤 예외가 발생했는지 알 수 없고 예외가 발생할 때 경우에 따라서 다르게 처리하고 싶어도 할 수 없다.
*/ 
public class ThrowsTest01 {
	public int test(int num1, int num2) { // 계산만 하는 메소드
		int result = 0;
		try {
		System.out.println("------------test()메소드 내부---------------");
		System.out.println("입력값:"+num1);
		System.out.println("입력값:"+num2);
		result = num1/num2;
		System.out.println("결과;"+result);
		System.out.println("------------test()메소드 내부---------------");
		}catch(ArithmeticException e) {
			//예외가 발생하면 result변수에는 0을 정의한다
			result = 0;
		}
		return result;
	}
	public void show() { //non-static method // 숫자를 전달하여 test()를 호출하는 메소드
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num1 = key.nextInt();
		System.out.print("숫자입력:");
		int num2 = key.nextInt();
		int result = test(num1, num2);
		
		//무조건 실행되어야 하는 명령문
		System.out.println("test()호출결과:"+result);
	}
	public static void main(String[] args) { //static method
		ThrowsTest01 obj = new ThrowsTest01();
		obj.show();
		// static에서 non-static을 호출할 때는 자신의 클래스에서의 메소드를 호출한다해도 반드시 클래스를 객체로 불러서 호출해야 한다.
	}
}
