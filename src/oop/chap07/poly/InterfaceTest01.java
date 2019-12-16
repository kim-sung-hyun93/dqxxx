package oop.chap07.poly;
/*
�������̽� ����
<<�������̽�>>
=> �߻�޼ҵ�(����� ����)�� �����ϴ� Ư���� Ŭ���� 

1. �������̽��� interfaceŰ���带 �̿��ؼ� ����.
2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����.
	- public abstract�� ��������.
	- ����� ������ �ڵ����� �߰��ȴ�.
3. �������̽��� �������̽��� ����� �� �ִ�. (extends �̿�)	
	- �����������̽��� �����������̽��� �߻�𼼵带 ��ӹ޴´�.
4. Ŭ������ �������̽��� ����� �� �ִ�. (implements �̿�)	
	- �������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡 extends�� ���� �����ϰ� implements�� �����ؾ��Ѵ�.
5. �������̽��� �������� ����� �� �ִ�. ��, ���� ����� �����ϴ�.
	implements �ڿ��� �������̽��� ������ ��, "," �� �����ؼ� ����
6. Ŭ������ �������̽����� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽��� ������ �νĵȴ�.(��ӹ޴� ��� Ŭ����, �������̽��� ���� Ÿ���� ���.)

�����޼ҵ�鿡�� ������ ����.

*/
interface InterA{
	public abstract void test();
	void display(int num);
}
interface InterB extends InterA{
	void show();
}
interface InterC{ 
	
}
class SuperA{
	
}
//SubA�� SuperA, InterA, InterB, InerC�� ����
class SubA extends SuperA implements InterB, InterC{
	@Override
	public void test() {
	}
	@Override
	public void display(int num) {
	}
	@Override
	public void show() {
	}
}

public class InterfaceTest01 {
	public static void main(String[] args) {
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();
	}
}


