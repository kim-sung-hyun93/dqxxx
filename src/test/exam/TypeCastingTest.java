package test.exam;
public class TypeCastingTest{
	public static void main(String[] args){
		//�⺻������ ����ȯ
		//- �ڵ�����ȯ(ū ������Ÿ���� ���� = ���� ������Ÿ�� ����)
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l; // longŸ���� �Ǽ������� ��ȯ�Ǿ� ���
		double d = f; 
		System.out.println(d);

		char c = 'e';
		System.out.println(c);
		//A�� ascii���� ����ϰ� ���� ���
		int data = c; // int = chart -> �ڵ�����ȯ
		System.out.println(data);

		//- ����� ����ȯ
		//�⺻������ ����� ����ȯ
		byte bytedata = (byte)200;
		System.out.println(bytedata);

		int intdata = 111;
		//int�����͸� char�� ��ȯ�ϴ� ���
		char chardata = (char)intdata;
		System.out.println(chardata);
		System.out.println((char)115); // 115�� char�� ��ȯ�� ������ ���. (����� ĳ����)

	//	double doubledata = 20/100*100;
	//	System.out.println(doubledata); // 0.0���� ���

		double doubledata = (double)20/100*100; //int������ double�������� �ٲپ ���.
		System.out.println(doubledata); // 20.0���� ���

	}
}