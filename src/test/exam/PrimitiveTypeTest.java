package test.exam;
//자바 기본형 데이터의 리터럴에 대해서 살펴보는 예제
public class PrimitiveTypeTest{
	public static void main(String[] args){
		//boolean형
		boolean bool = true; // true or false
		System.out.println(bool);

		//문자형
		char c = 'a'; // char타입 변수는 리터럴을 표현할 때 ' '을 사용.
		System.out.println(c);

		//정수형변수
		//정수형변수에 기본으로 할당되는 리터럴의 타입은 int
		byte b = 127;
		System.out.println(b);

		short s = 32767; // short = int
		System.out.println(s);
	
		int i = 2147483647; // int = int
		System.out.println(i);

		long l = 2147483648L; // long타입인 경우에는 접미사 L이나 l을 추가한다.
		System.out.println(l);


		//실수형
		//실수형 리터럴의 기본 타입은 double.
//		float f = 10.5;  // float = double 넣는 것이기 때문에 오류가 뜬다. 
		float f = 10.5F; // float타입인 경우 접미사 F나 f를 추가한다.
		System.out.println(f);

		double d = 10.5;
		System.out.println(d);

	//	double exam = 10/3; // equal 오른쪽부터 계산해야한다. int/int => int. int는 4바이트이기 때문에 8바이트인 double에 넣을 수 있다.
	//	System.out.println(exam); // 3.0으로 출력

		double exam = 10/3.0; 
		System.out.println(exam); // 3.3333333333으로 출력
	}
}