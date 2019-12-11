package chap04;
import java.util.Scanner;
//입력받은 구구단을 출력
public class ForExam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 단 : ");
		int input = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(input+" * "+i+" => "+input * i);
		}
	}
}
