package chap04;
import java.util.Scanner;
//�Է¹��� �������� ���
public class ForExam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �� : ");
		int input = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(input+" * "+i+" => "+input * i);
		}
	}
}
