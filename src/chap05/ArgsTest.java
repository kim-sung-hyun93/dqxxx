package chap05;

public class ArgsTest {
	public static void main(String[] args) {
		/*
		 * args = new String[2]
		 *					2?? : 명령행 매개변수의 갯수만큼 설정
		 * args[0] = "100"
		 * args[1] = "200" 
		*/
		System.out.println("명령행매개변수->"+args[0]);
		System.out.println("명령행매개변수->"+args[1]);
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		// String으로 입력받은 명령행매개변수를 int로 변환
		// int num1 = args[0];
		// int = String X <<<< 변환을 해야한다!
		int num1 = Integer.parseInt(args[0]); // 변환.
		int num2 = Integer.parseInt(args[1]); // 변환.
		System.out.println("합=>"+(num1+num2)); // String이기  때문에 연산이 안된다!
	}
}
