package chap03;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = ( ch != (int)'A'  ) ?  (int)'A'+32  : ch;
		
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);
		
		/* 대문자를 소문자로 변경하는 코드. 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경. 문자코드는 소문자가 대문자보다
		 32 만큼 더 크다. 예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다.
		 실행 결과 :  
		ch:A
		ch to lowerCase:a */
		// (1) 조건식에 거짓을 넣어야된다.
		
	// int ch = (char)A;
	// System.out.println();
		
	}

}
