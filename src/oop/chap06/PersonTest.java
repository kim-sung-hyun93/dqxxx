package oop.chap06;
//Person클래스를 사용하는 클래스
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("장동건", "서울시", 45);
		System.out.println(p1.getName()+","+p1.getAddr()+","+p1.getAge());
		
		Person p2 = new Person("고소영", "울산시", 99);
		System.out.println(p2.getName()+","+p2.getAddr()+","+p2.getAge());
	}
}
