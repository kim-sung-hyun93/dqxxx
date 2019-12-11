package chap04;

public class GuGu {
	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "*" + i + "=>" + i * dan + "\t");
			}
			System.out.println();
		}
	}
}