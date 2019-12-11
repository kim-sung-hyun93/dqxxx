package oop.chap07;
//static 메소드
// - static 멤버를 제어하기 위한 용도
// - 유맅리티처럼 자주 사용하는 메소드	
// - static메소드는 시작할 때부터 바로 메모리에 올라간다. 그래서 static을 붙임
public class StaticMethodDemo {
	public static void staticTest1() {
		//1. static메소드에서 static메소드 호출 - 일반적인 방법 가능
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display() {
		//2. non-static메소드에서 non-static메소드 호출 - 일반적인 방법 가능
		show();
		System.out.println("display()");
	}
	public static void staticTest2() {
		//3. non-static메소드에서 static메소드 호출 - 일반적인 방법으로 가능
		staticTest2();
		System.out.println("staticTest2()");
	}
	public void show() {
		System.out.println("show()");
	}
	public static void staticTest3() {
		//4. static메소드에서 non-static메소드 호출 - non-static메소드가 메모리에 없기 때문에 같은 클래스에서 정의된
		//								  	    메소드라고 하더라도 무조건 객체생성 후에 호출해야한다.
		//show(); // 메모리에 아직 올라오지 않았따.
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.show(); // 위에 new를 통해 메모리에 먼저 올려놓고 사용해야 한다.
		System.out.println("staticTest3()");
	}
}
