package oop.chap07.poly;
public class MMSSender extends Sender {
	int length;
	public MMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//SMSSender의 고유기능 실행
		System.out.println(length+"로 "+name+"로 전송완료.");
	}
}
