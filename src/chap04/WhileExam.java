package chap04;

public class WhileExam {
	public static void main(String[] args) {
		//1~100±îÁö ÃÑÇÕ
		int i =1;
		int sumVal = 0; //ÃÑÇÕ
		int oddsumVal = 0; //È¦¼öÇÕ
		int evensumVal = 0; //Â¦¼öÇÕ
		while(i<=100) {
			sumVal = sumVal+i;
			if((i%2) == 1) {
				oddsumVal = oddsumVal + i;
			}else {
				evensumVal = evensumVal + i;
			}
			i++;
		}
		System.out.println("ÃÑÇÕ=>"+sumVal);
		System.out.println("È¦¼öÇÕ:"+oddsumVal);
		System.out.println("Â¦¼öÇÕ:"+evensumVal);
	}
}
