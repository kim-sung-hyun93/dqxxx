package oop.chap06;
//PersonŬ������ ����ϴ� Ŭ����
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("�嵿��", "�����", 45);
		System.out.println(p1.getName()+","+p1.getAddr()+","+p1.getAge());
		
		Person p2 = new Person("��ҿ�", "����", 99);
		System.out.println(p2.getName()+","+p2.getAddr()+","+p2.getAge());
	}
}
