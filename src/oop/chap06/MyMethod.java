package oop.chap06;
// �޼ҵ� �����ϴ� ������ ���� Ŭ����
public class MyMethod {
	//1. �ް������� ���� ���ϰ��� ����(void) �޼ҵ�
	// -�ڵ��� �ߺ��� �����ϰ�, �ڵ带 ������ �� �ְ� �Ǿ���.
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println(); 
	}
	//2. ���ϰ��� ���� �Ű������� �� ���� �޼ҵ�
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	//3. ���ϰ��� ���� �Ű������� �ΰ��� �޼ҵ�
	//=> ��±�ȣ, ����� Ƚ���� �Ű������� ���� �޾� ����� �� �ֵ��� �޼ҵ带 �����ϰ�, MyMethodTest.java���� ȣ���ؼ� �׽�Ʈ�ϱ�
	//������ ���������, ����� ���� ������ �����־�� �Ѵ�.
	public void display(String str, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	//4. �Ű�����, ���ϰ��� ��� �ִ� �޼ҵ�
	//=> ���� 2���� �Ű������� ���� �޾� ���ؼ� ����� �����ϴ� �޼ҵ�
	//=> �޼ҵ� ����ο� ����Ÿ���� �����ϴ� ��� �ݵ�� �޼ҵ��� ���������� ���� return�ؾ��Ѵ�.
	public int add(int num1, int num2) { // ���� add��� �޼ҵ带 ȣ���� �� int�� �����Ͱ� return �ȴ�.
		int result = 0;
		result = num1+num2;
		return result;
	};
	
	
	
	
	
}
