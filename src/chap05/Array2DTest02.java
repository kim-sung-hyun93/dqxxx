package chap05;
//2차원 배열의 선언과 생성 - 가변배열
public class Array2DTest02 {
	public static void main(String[] args) {
		//2차원 배열부터 배열이 참조하는 배열의 요소를 각각 다르게 정의할 수 있다.
		int[][] myarr = new int[3][]; // 두번째는 생략가능. 첫번째만 값을 주고 첫번째 실제 값이 달라지는경우?!
		myarr[0] = new int[3];
		myarr[1] = new int[2];
		myarr[2] = new int[1];
		
		for(int outer =0;outer<myarr.length;outer++) {
			for(int i=0;i<myarr[outer].length;i++) {
				System.out.print(myarr[outer][i]+"\t");
			}
			System.out.println();
		}
	}
}
