package oop.chap06.constructor;

import java.io.File;
import java.io.FileInputStream;

//API�� ���ǵ� �����ڸ޼ҵ� Ȯ���ϱ� 
public class APIConstructorTest {
	public static void main(String[] args) throws Exception{
		byte[] data1 = {65,66,67,68,69};
		char[] data2 = {'a','b', 'c', 'd', 'e'};
		String str = new String(); // String str = "";
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 2, 2);
		String str4 = new String(data2);
		
		System.out.println(str1+";"+str1.length());
		System.out.println(str2+";"+str2.length());
		System.out.println(str3+";"+str3.length());
		System.out.println(str4+";"+str4.length());
		
		File f = new File("test.txt"); // ��ü�� ������ �� Ư�������� �ʱ�ȭ. => �̰��� "������"�� ����
		System.out.println(f.getName());
		
		FileInputStream fs = new FileInputStream("test.txt");
		System.out.println((char)fs.read()); //ascii�ڵ尪�� ����
											//���� ����ϰ� ���� file�� ���� �Ѱ��ְ� �ʱ�ȭ->file�� �ѱ��ڸ� �д���!
											//file�� �ٷ��, open�� file�� �д� ��.
	}
}

/*<<������>
java���� ���۵Ǵ� index�� ���� �� 0������ ����.
java
0123

�����ڴ� �޼ҵ��. ��ü�� ������ �� ȣ��Ǵ� Ư���� �޼ҵ��̸� �ַ� �ڿ��� �׼����ϰų� �ڿ��� ����ϱ� ���ؼ� �ʱ�ȭ�ϰų� �ڿ����� �۾��� �ϰų�
��ü�� ������ �ִ� ��������� �ʱ�ȭ�ϴ� �۾��� �����Ѵ�.(�ڿ� - DBMS, ��Ʈ��ũ, ���Ͻý���....)


[��ü����]
Ŭ����Ÿ�� ����  = new �����ڸ޼ҵ�()
-------				------
Ŭ����Ÿ��:�����Ŭ����		�����ڸ޼ҵ�:Ŭ���� �ȿ� �̸� ���ǵǾ� �ִ� ������ �޼ҵ带 ȣ��
							  �Ϲ� �޼ҵ�ó�� ������ �޼ҵ嵵 �Ű������� �ܺο��� ���� ���� �޾� ����� �� �ִ�.

[��Ģ]
1. ������ �޼ҵ���� Ŭ������� ��ҹ��ڱ��� ��Ȯ�ϰ� ������ �̸����� �����ؾ� �Ѵ�.
	=> ����Ÿ���� ������� �ʴ´�.
	
2. ������ �޼ҵ带 �������� ������ �����Ϸ��� �⺻�����ڸ� �����Ѵ�.
	=> �⺻������ : �Ű������� ���� ������
	=> ������ �޼ҵ带 �����ڰ� �����ϸ� �����Ϸ��� �⺻�����ڸ� �������� �ʴ´�.
	=> ó���Ǵ����� ���ٰ� �ϴ��� ������ �⺻�����ڴ� �����ؾ� �Ѵ�.
	
3. ������ �޼ҵ嵵 �Ϲ� �޼ҵ� ó�� �Ű������� �����ϰ� �ܺο��� ���� ���޹޾� ����� �� �ִ�.
	=> �ַ� ��ü�� ���ǵ� ��������� ���� �ʱ�ȭ�ϴ� �۾�
	
4. ������ �޼ҵ嵵 �Ϲ� �޼ҵ�ó�� �����ε��� ����Ѵ�.

5. ������ �޼ҵ� ���ο��� �ٸ� ������ �޼ҵ带 ȣ���� �� �ִ�.
	=> this(�Ű�����.....)
	=> �ݵ�� ù ���� ���忡�� ȣ���ؾ� �Ѵ�.



*/