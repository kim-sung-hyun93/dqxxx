package chap03;

import java.util.Random;

public class APIExam {
		public static void main(String[] args) {
		Random rand = new Random();
		
		int value = rand.nextInt();
		System.out.println("������ => "+value);
			
		value = rand.nextInt(200);
		System.out.println("1���� 100���� ������ => "+value);
		
		boolean value3 = rand.nextBoolean();
		System.out.println("1���� 100���� ������ => "+value3);
			
	}

}