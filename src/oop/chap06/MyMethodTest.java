package oop.chap06;
// MyMethodŬ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
// �����͸� private���� �����߱� ������, �޼ҵ带 �̿��Ͽ� �����͸� �������ϱ� ���ؼ� �޼ҵ带 �����Ͽ���.
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("**********���α׷�����**********");
		MyMethod m = new MyMethod();
		//1. �Ű������� ���� void�� �޼ҵ��� ȣ��
		m.display();
		System.out.println("++++++++++step1+++++++++");
		m.display();
		System.out.println("++++++++++step2+++++++++");
		m.display();
		
		//2. �Ű������� �� ��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");
		
		//3. �Ű������� �� ��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��", 3);
		m.display("��", 9);
		m.display("��", 15); //display(String, int) - �̿� ���� ������ display�� ã�� ���̴�.
		System.out.println("**********���α׷�����**********");
		
		//4. �Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
		//�޼ҵ带 ȣ���ϴ� ���, ���ϰ��� �����ϴ� �޼ҵ��� 
		// �� ���ϰ��� ������ Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�!!
		// �� �޼ҵ��� �Ű������� ������ �� �ִ�.
		
		int result = m.add(100, 200);
		System.out.println("�޼ҵ� ȣ�� ���=>"+result); // ��
		System.out.println("�޼ҵ� ȣ�� ���=>"+m.add(200,300)); // �� �ٸ� �޼ҵ���� �Ű������� �Ǿ���.
	}
}
