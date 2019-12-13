package oop.chap07;
public class Dessert {
	private String productName;
	private int price;
	private int count;
	
	public Dessert() {
		
	}
	
	public Dessert(String productName, int price, int count) {
		super();
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	
	public static void print(){
		System.out.println("===============================");
		System.out.println("주문항목\t가격\t수량");
		System.out.println("===============================");
	}
	
	public void printProductInfo() {
		System.out.println(productName+"\t"+price+"\t"+count);
	}
	public int getTotalPrice() {
		int sum = getPrice()*getCount();
		return sum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
