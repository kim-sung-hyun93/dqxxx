package chap04;

public class ForExam03 {
	public static void main(String[] args) {
		int sumVal = 0; //����
		int oddsumVal = 0; //Ȧ����
		int evensumVal = 0; //¦����
		for(int i=1; i<=100; i++) {
			sumVal = sumVal+i;
			if((i%2) == 1) {
				oddsumVal = oddsumVal + i;
			}else {
				evensumVal = evensumVal + i;
			} // �� ���� ��츸 �ִ� ���� if�� else�� ����ϱ�.
		}
		System.out.println("����:"+sumVal);
		System.out.println("Ȧ����:"+oddsumVal);
		System.out.println("¦����:"+evensumVal);
	}
}
//no.3 -1���� 100������ ��, Ȧ����, ¦���� ���ϱ�
//[�������]
//��:_____
//Ȧ����:_____
//¦����:_____