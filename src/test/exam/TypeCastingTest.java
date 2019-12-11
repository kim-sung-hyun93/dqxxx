package test.exam;
public class TypeCastingTest{
	public static void main(String[] args){
		//기본형에서 형변환
		//- 자동형변환(큰 데이터타입의 변수 = 작은 데이터타입 변수)
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l; // long타입이 실수형으로 변환되어 출력
		double d = f; 
		System.out.println(d);

		char c = 'e';
		System.out.println(c);
		//A의 ascii값을 사용하고 싶은 경우
		int data = c; // int = chart -> 자동형변환
		System.out.println(data);

		//- 명시적 형변환
		//기본형에서 명시적 형변환
		byte bytedata = (byte)200;
		System.out.println(bytedata);

		int intdata = 111;
		//int데이터를 char로 변환하는 경우
		char chardata = (char)intdata;
		System.out.println(chardata);
		System.out.println((char)115); // 115를 char로 변환한 것으로 출력. (명시적 캐스팅)

	//	double doubledata = 20/100*100;
	//	System.out.println(doubledata); // 0.0으로 출력

		double doubledata = (double)20/100*100; //int연산을 double연산으로 바꾸어서 계산.
		System.out.println(doubledata); // 20.0으로 출력

	}
}