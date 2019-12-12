package oop.chap07;

class Person{
	private String name; 
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.print("성명:"+getName()+
				"\t\t나이:"+getAge());
	}
}

//부모 클래스는 private으로 막지말고 default (  ) 로 두어야 한다.
//상속 => 코드의 양이 감소