package oop.chap07;
/*
<<상속관계에서 생성자가 갖는 특징>>
1. 클래스의 모든 생성장메소드의 첫 번째 문장에는 부모클래스의 기본 생성자를 호출하는 명령문이 생략되어 있다.
	=> 부모클래스도 메모리에 할당되어야 사용할 수 있으므로
	=> 부모의 생성자를 호출하는 방법은 super(...)
	   super()는 부모의 매개변수 없는 기본생성자
	=> 이미 다른 생성자를 호출하는 경우에는 super()를 할 수 없다.
	   this()를 호출하는 경우 super를 호출할 수 있다.
	
2. 모든 클래스의 최상위 클래스는 java.lang.Object이다.
	=> 자바에서 실행되는 모든 객체가 갖는 공통의 특징을 정의한 클래스로 상속받고 있는 클래스가 없는경우 컴파일러가 자동으로 상속하도록 한다.

3. 부모클래스에 정의되어 있는 멤버변수가 값을 셋팅해야 하는 경우에도 하위클래스에서 전달될 수 있도록 정의한다.
	=>super(값1, 값2, ....)를 통해 접근한다.
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	부모의 매개변수가 있는 생성자를 호출하는
	
	
	
*/
class SuperA {
	String name;
	int age;
	SuperA(){
		super(); // -> 아무것도 상속되어 있지 않기 때문에 자동으로 java.lang.Object가 extends되고 있는 거랑 똑같다.
	}
	SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

class SubA extends SuperA{
	String addr;
	int point;
	SubA(){
		super(); // 모든 생성자메소드의 첫 번째 문장에는 super()가 생략되어있다.(호출된 것임)
	}
	SubA(String addr){
		super();
		this.addr = addr;
	}
	SubA(String name, int age, String addr, int point){
		super(name, age); // 부모의 매개변수 2개 생성자를 호출 // super(String, int)
		this.addr = addr;
		this.point = point;
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("장동건", 45, "서울시", 1000);
		System.out.println(obj.name+","+obj.age+","+obj.addr+","+obj.point);
	}
}
