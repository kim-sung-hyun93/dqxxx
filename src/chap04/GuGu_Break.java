package chap04;
//break�� ���� - break���� ����� ���� ����������.
public class GuGu_Break {
	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			if(dan == 5) {
				break;
			}
			for (int i = 1; i <= 9; i++) {
				/*if(dan == 5) { break���� ���� for�� ����Ǿ� �����Ƿ� �ݺ����� ��������� �ʴ´�.
					break;
				}*/
				System.out.print(dan + "*" + i + "=>" + i * dan + "\t");
			}
			System.out.println();
		}
	}
}