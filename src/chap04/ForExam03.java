package chap04;

public class ForExam03 {
	public static void main(String[] args) {
		int sumVal = 0; //총합
		int oddsumVal = 0; //홀수합
		int evensumVal = 0; //짝수합
		for(int i=1; i<=100; i++) {
			sumVal = sumVal+i;
			if((i%2) == 1) {
				oddsumVal = oddsumVal + i;
			}else {
				evensumVal = evensumVal + i;
			} // 두 가지 경우만 있는 경우는 if와 else로 사용하기.
		}
		System.out.println("총합:"+sumVal);
		System.out.println("홀수합:"+oddsumVal);
		System.out.println("짝수합:"+evensumVal);
	}
}
//no.3 -1부터 100까지의 합, 홀수합, 짝수합 구하기
//[출력형태]
//합:_____
//홀수합:_____
//짝수합:_____