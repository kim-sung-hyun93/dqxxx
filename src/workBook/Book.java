package workBook;
public class Book {

	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		double dbp =0.0;
		dbp = bookPrice * (1-(bookDiscountRate*0.01));
		//dbp = bookPrice - (bookPrice*(bookDiscountRate/100));
//		System.out.println(dbp+"------");
		return dbp ;
	}
	
	public void print() {
		System.out.println(getBookName()+"\t"+getBookPrice()+"¿ø\t"+
	getBookDiscountRate()+"%\t"+getDiscountBookPrice()+"¿ø");
	}
		
	
}
