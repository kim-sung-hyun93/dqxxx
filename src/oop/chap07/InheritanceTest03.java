package oop.chap07;
/*
<<��Ӱ��迡�� �����ڰ� ���� Ư¡>>
1. Ŭ������ ��� ������޼ҵ��� ù ��° ���忡�� �θ�Ŭ������ �⺻ �����ڸ� ȣ���ϴ� ��ɹ��� �����Ǿ� �ִ�.
	=> �θ�Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �� �����Ƿ�
	=> �θ��� �����ڸ� ȣ���ϴ� ����� super(...)
	   super()�� �θ��� �Ű����� ���� �⺻������
	=> �̹� �ٸ� �����ڸ� ȣ���ϴ� ��쿡�� super()�� �� �� ����.
	   this()�� ȣ���ϴ� ��� super�� ȣ���� �� �ִ�.
	
2. ��� Ŭ������ �ֻ��� Ŭ������ java.lang.Object�̴�.
	=> �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������ ��ӹް� �ִ� Ŭ������ ���°�� �����Ϸ��� �ڵ����� ����ϵ��� �Ѵ�.

3. �θ�Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ؾ� �ϴ� ��쿡�� ����Ŭ�������� ���޵� �� �ֵ��� �����Ѵ�.
	=>super(��1, ��2, ....)�� ���� �����Ѵ�.
	�ѤѤѤѤѤѤѤѤѤ�
	�θ��� �Ű������� �ִ� �����ڸ� ȣ���ϴ�
	
	
	
*/
class SuperA {
	String name;
	int age;
	SuperA(){
		super(); // -> �ƹ��͵� ��ӵǾ� ���� �ʱ� ������ �ڵ����� java.lang.Object�� extends�ǰ� �ִ� �Ŷ� �Ȱ���.
	}
	SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

class SubA extends SuperA{
	String addr;
	int point;
	SubA(){
		super(); // ��� �����ڸ޼ҵ��� ù ��° ���忡�� super()�� �����Ǿ��ִ�.(ȣ��� ����)
	}
	SubA(String addr){
		super();
		this.addr = addr;
	}
	SubA(String name, int age, String addr, int point){
		super(name, age); // �θ��� �Ű����� 2�� �����ڸ� ȣ�� // super(String, int)
		this.addr = addr;
		this.point = point;
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("�嵿��", 45, "�����", 1000);
		System.out.println(obj.name+","+obj.age+","+obj.addr+","+obj.point);
	}
}
