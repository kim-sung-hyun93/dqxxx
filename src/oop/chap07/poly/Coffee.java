package oop.chap07.poly;

public class Coffee extends Beverage{
	static int amount; // ��� ��ü�� �������� ���� ��->static. ���������̱� �빮�� !!
	
	public Coffee() {
		
	}
	public Coffee(String name) { //Coffee�� �Ǹ�
		super(name);
		amount++;
		//�ֹ��Ǵ� ������ ������ ���
		calcPrice();
	}
	
	//static ����� �׼����ϱ� ���ؼ� static �޼ҵ带 �����ؼ� �׼����Ѵ�.
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
