package chap09.api.lang;

import java.util.Date;
import java.util.Random;

import javax.xml.crypto.Data;

//Object클래스는 자바에서 작성하는 모든 클래스의 최상위
public class ObjectTest01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); //클래스의 정보를 리턴
		System.out.println(obj1.hashCode()); //객체의 정보를 리턴
		System.out.println(obj1.toString()); //객체의 주소를 리턴   -기본메소드
		System.out.println(obj1); //obj1.toString() 호출과 동일.
								  //기본메소드이므로 생략이 가능
		Person p1 = new Person("장동건", 50, "서울");
		System.out.println(p1.toString()); // 개발자가 작성하는 모든 클래스에서 오버라이딩해야 한다.
		System.out.println(p1);
		
		//API의 클래스들...
		Random rand = new Random();
		System.out.println(rand);
		Date d = new Date();
		System.out.println(d);
		String str = new String("java");
		System.out.println(str);
	}
}

//우리가 만드는 클래스의 멤버변수값을 체크하기 위해 오버라이딩하는것이다.
// 참좁ㄴ수들만 출력해서 객체들의 정보들을 확인하기 위해.
