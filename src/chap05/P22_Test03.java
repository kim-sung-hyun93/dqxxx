package chap05;
public class P22_Test03 {
	public static void main(String[] args) {
		int [][] arr2 = {
							{5,5},
							{10,10,10,10,10},
							{20,20,20},
							{30,30,30,30}
						};
		int sum = 0;
		int count = 0;
		for (int outer = 0; outer < arr2.length; outer++) {
			for (int i = 0; i < arr2[outer].length; i++) {
				sum = sum + arr2[outer][i];
				count++;
				System.out.print(arr2[outer][i] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("sum=" + sum);
		System.out.println("avg=" + (double) sum / count);
	}
}
