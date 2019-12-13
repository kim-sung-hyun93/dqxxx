package oop.chap07.poly;

public class Coffee extends Beverage{
	static int amount; // 모든 객체가 공통으로 갖는 값->static. 공유변수이기 대문에 !!
	
	public Coffee() {
		
	}
	public Coffee(String name) { //Coffee가 판매
		super(name);
		amount++;
		//주문되는 음료의 가격을 계산
		calcPrice();
	}
	
	//static 멤버를 액세스하기 위해서 static 메소드를 정의해서 액세스한다.
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void calcPrice() {
		if(getName().equals("Americano")) {
			setPrice(1500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}
	}
}
