package oop.chap06;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// - ��������� ������ ���� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�.
// - �ʱⰪ�� �������� �ʾƵ� �������� null, �������� 0, �Ǽ����� 0.0, boolean�� false
// - ��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
// 		public 
// 		default
// 		protected
// 		private
// Ŭ������ �޼ҵ�� �ܺο��� ����ϴ� public���� �������ְ�, �Ϲ�Ŭ���������� ��������� �ܺο��� �������� ���ϵ��� private���� ����.
// ����(������)�� ���� ��������������, �޼ҵ带 ���� �������� �� �ֵ��� ���α׷��� �ۼ��ض�.
// Ŭ������ ������ �� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ� public�޼ҵ带 ���ؼ� ������ �� �ֵ��� ����.
public class Person { 
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	private String name; // Ŭ������ Ư���� ��Ÿ���� ������, Ŭ���� ����� �ٷ� �Ʒ� => class�� ��ǥ�ϴ� ���� => ��� ����or�ʵ�
	private String addr; //(default) // Ư���� ��Ȳ�� �ƴϸ� �ʱⰪ�� ���� �ʴ´�!
	private int age;
	
	public Person() {
		//�⺻�����ڵ� �������� �Ѵ�!!
	}
	
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
		
	}
	// �ڹٿ��� �� �� �ִ� ��� ������ Ÿ���� ��� �����ϴ�!
	// ��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ�� ���� ������ �� �̴� �޼ҵ尡 �ʿ��ϴ�.
	// �̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���

	// name ������ ���� �����ϴ� �޼ҵ� "setter�޼ҵ�" -> ���� �ٲٴ� �޼ҵ�
	// - �޼ҵ�� : set + ���������(ù ���ڸ� �빮�ڷ� �ٲ�) -> return�� void
	//           setName
	public void setName(String name) {
		this.name = name;  // this => ���� ���� ��Ī. ���� ���� ������ �ִ� name������ �ܺο��� �Է¹��� ������ ��ü�ϰڴ�.
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ� "getter"�޼ҵ� ->  
	// - �޼ҵ�� : get + ���������(ù ���ڸ� �빮�ڷ� �ٲ�) -> return�� �ִ�.
	// 			 getName
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}
}


