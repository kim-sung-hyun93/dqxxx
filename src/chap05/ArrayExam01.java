package chap05;
//배열을 작성하고 액세스하기
public class ArrayExam01 {
	public static void main(String[] args) {
		int[] myarr = new int[10];
		myarr[2] = 100;
		myarr[3] = 200;
		myarr[5] = 300;
		
		System.out.println("배열 요소의 갯수 : "+myarr.length);
		for(int i=0; i<myarr.length; i++) {
			System.out.println(i+"번요소의 값 : "+myarr[i]);
		}
		
	}
}
// int형 배열 작성
// 요소의 갯수 : 10
// 		2번	3번	 5번
// 요소에 100 200 300 각각 초기화
// 모든 요소의 값 출력하기