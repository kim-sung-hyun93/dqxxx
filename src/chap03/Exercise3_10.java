package chap03;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = ( ch != (int)'A'  ) ?  (int)'A'+32  : ch;
		
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);
		
		/* �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ�. ���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� ����. �����ڵ�� �ҹ��ڰ� �빮�ں���
		 32 ��ŭ �� ũ��. ���� ��� 'A'�� �ڵ�� 65�̰�, 'a'�� �ڵ�� 97�̴�.
		 ���� ��� :  
		ch:A
		ch to lowerCase:a */
		// (1) ���ǽĿ� ������ �־�ߵȴ�.
		
	// int ch = (char)A;
	// System.out.println();
		
	}

}
