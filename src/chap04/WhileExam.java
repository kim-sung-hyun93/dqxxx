package chap04;

public class WhileExam {
	public static void main(String[] args) {
		//1~100���� ����
		int i =1;
		int sumVal = 0; //����
		int oddsumVal = 0; //Ȧ����
		int evensumVal = 0; //¦����
		while(i<=100) {
			sumVal = sumVal+i;
			if((i%2) == 1) {
				oddsumVal = oddsumVal + i;
			}else {
				evensumVal = evensumVal + i;
			}
			i++;
		}
		System.out.println("����=>"+sumVal);
		System.out.println("Ȧ����:"+oddsumVal);
		System.out.println("¦����:"+evensumVal);
	}
}
