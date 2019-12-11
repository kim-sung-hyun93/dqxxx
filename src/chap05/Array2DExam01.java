package chap05;
/*
 * 2차원 배열 연습
 * [출력 형태]
 * 1   2   3   4   5
 * 6   7   8   9   10
 * 11  12  13  14  15
 * 16  17  18  19  20
 * 21  22  23  24  25
 * 
 * *   2   3   4   5
 * 6   *   8   9   10
 * 11  12  *   14  15
 * 16  17  18  *   20
 * 21  22  23  24   *
*/
public class Array2DExam01 {
	public static void main(String[] args) {
		// 1. 2차원 배열을 생성
		// 2. 2차원 배열에 값을 저장하기
		// 3. 3차원 배열에 저장된 데이터를 출력형태와 같이 출력하기 
		
		int[][] myarr = new int[5][5];
		int sum = 1;
		
		/*for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				sum = sum +1;
				myarr[j][i] = sum;
			}
			System.out.println();
		}
		*/
		for(int outer=0;outer<myarr.length;outer++) {
			for(int i=0;i<myarr[outer].length;i++) {
				myarr[outer][i] = sum;
				sum++;
				System.out.print(myarr[outer][i]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		
		int[][] myarr2 = new int[5][5];
		int sum2 = 0;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				sum2 = sum2 + 1;
				myarr2[j][i] = sum2;
			}
			System.out.println();
		}

		for (int outer = 0; outer < myarr2.length; outer++) {
			for (int i = 0; i < myarr2[outer].length; i++) {
				if (i == outer) {
					System.out.print("*\t");
				} else {
					System.out.print(myarr2[outer][i] + "\t");
				}
			}
			System.out.println();
		}

	}
}
