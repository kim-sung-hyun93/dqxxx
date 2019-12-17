package chap09.api.lang;
//String 클래스의 기본 메소드와 String클래스의 특징
//=> 문자열처리 메소드를 자주호출하거나 +연산자로 문자열을 연결하는 작업이 많은경우 
//	 String을 사용하지 않고 StringBuffer or StringBuilder를 이용한다.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		
		//원본변환
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase()); //대문자로
		
		System.out.println("원본데이터:"+str1);
		
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase()); //소문자로
		System.out.println("str1.substring(2)=>"+str1.substring(2)); //요소 2번부터
		System.out.println("str1.substring(2, 8)=>"+str1.substring(2, 8)); //요소2번부터 7까지.(8포함 X)
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));
		
		System.out.println("원본데이터:"+str1); //원본을 변경하는게 아니라. 원본을 읽어서 또다른 string객체를 생성하는것.
		
		//=> 아무리 바꿔도 원본은 변하지 않는다.
		// string버퍼는 고려 o (문자열 조작이 빈번하게 일어나는 경우)
		// string빌더는 고려 X
		// 동시접속에 대한 고려.
		// web은  필요없고 안드로이드에서는 직접 쓰레드 처리O
	}
}
