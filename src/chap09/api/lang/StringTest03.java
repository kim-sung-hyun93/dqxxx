package chap09.api.lang;
//String Ŭ������ �⺻ �޼ҵ�� StringŬ������ Ư¡
//=> ���ڿ�ó�� �޼ҵ带 ����ȣ���ϰų� +�����ڷ� ���ڿ��� �����ϴ� �۾��� ������� 
//	 String�� ������� �ʰ� StringBuffer or StringBuilder�� �̿��Ѵ�.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		
		//������ȯ
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase()); //�빮�ڷ�
		
		System.out.println("����������:"+str1);
		
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase()); //�ҹ��ڷ�
		System.out.println("str1.substring(2)=>"+str1.substring(2)); //��� 2������
		System.out.println("str1.substring(2, 8)=>"+str1.substring(2, 8)); //���2������ 7����.(8���� X)
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));
		
		System.out.println("����������:"+str1); //������ �����ϴ°� �ƴ϶�. ������ �о �Ǵٸ� string��ü�� �����ϴ°�.
		
		//=> �ƹ��� �ٲ㵵 ������ ������ �ʴ´�.
		// string���۴� ��� o (���ڿ� ������ ����ϰ� �Ͼ�� ���)
		// string������ ��� X
		// �������ӿ� ���� ���.
		// web��  �ʿ���� �ȵ���̵忡���� ���� ������ ó��O
	}
}
