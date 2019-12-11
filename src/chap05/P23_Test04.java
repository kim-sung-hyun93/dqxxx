package chap05;

import java.util.Random;

public class P23_Test04 {
	public static void main(String[] args) {
		
		int[] arr3 = new int[5];
		Random rand = new Random();
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr3.length; i++) {
			int value = rand.nextInt(10);
			if (value != 0) {
				arr3[i] = value;
			}
			System.out.print(value + "\t");
			sum = sum + value;
			count++;
		}

		System.out.println();
		System.out.println("sum=" + sum);
		System.out.println("avg=" + (double) sum / count);

	}
}
