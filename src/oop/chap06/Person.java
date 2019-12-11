package oop.chap06;
//클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할 때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형은 0, 실수형은 0.0, boolean은 false
// - 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
// 		public 
// 		default
// 		protected
// 		private
// 클래스나 메소드는 외부에서 써야하니 public으로 설정해주고, 일반클래스에서의 멤버변수는 외부에서 접근하지 못하도록 private으로 제어.
// 변수(데이터)를 직접 엑세스하지말고, 메소드를 통해 엑세스할 수 있도록 프로그램을 작성해라.
// 클래스를 정의할 때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고 public메소드를 통해서 접근할 수 있도록 구현.
public class Person { 
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	private String name; // 클래스의 특성을 나타내는 데이터, 클래스 선언부 바로 아래 => class를 대표하는 변수 => 멤버 변수or필드
	private String addr; //(default) // 특별한 상황이 아니면 초기값을 주지 않는다!
	private int age;
	
	public Person() {
		//기본생성자도 만들어줘야 한다!!
	}
	
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
		
	}
	// 자바에서 쓸 수 있는 모든 데이터 타입을 사용 가능하다!
	// 모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와 값을 가져올 수 이는 메소드가 필요하다.
	// 이런 역할을 하는 메소드를 정의하는 경우

	// name 변수에 값을 설정하는 메소드 "setter메소드" -> 값을 바꾸는 메소드
	// - 메소드명 : set + 멤버변수명(첫 글자를 대문자로 바꾼) -> return값 void
	//           setName
	public void setName(String name) {
		this.name = name;  // this => 현재 나를 지칭. 현재 내가 가지고 있는 name변수를 외부에서 입력받은 변수로 대체하겠다.
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드 "getter"메소드 ->  
	// - 메소드명 : get + 멤버변수명(첫 글자를 대문자로 바꾼) -> return값 있다.
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


