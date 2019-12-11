package chap05;

public class P14_Test07 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // 변환.
		System.out.println("입력 : "+num);
		int sum = 0;
		
		for(int i=0; i<100; i++) {
			if(num*i <= 100) {
				sum = sum + num * i;
			}
		}
		System.out.println("total => "+sum);
	}
}
