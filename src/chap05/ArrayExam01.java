package chap05;
//�迭�� �ۼ��ϰ� �׼����ϱ�
public class ArrayExam01 {
	public static void main(String[] args) {
		int[] myarr = new int[10];
		myarr[2] = 100;
		myarr[3] = 200;
		myarr[5] = 300;
		
		System.out.println("�迭 ����� ���� : "+myarr.length);
		for(int i=0; i<myarr.length; i++) {
			System.out.println(i+"������� �� : "+myarr[i]);
		}
		
	}
}
// int�� �迭 �ۼ�
// ����� ���� : 10
// 		2��	3��	 5��
// ��ҿ� 100 200 300 ���� �ʱ�ȭ
// ��� ����� �� ����ϱ�