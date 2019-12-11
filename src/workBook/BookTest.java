package workBook;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] bookArray = new Book[3];
		
		bookArray[0] = new Book();
		bookArray[0].setBookName("SQL PLUS");
		bookArray[0].setBookPrice(50000);
		bookArray[0].setBookDiscountRate(5);
		
		bookArray[1] = new Book();
		bookArray[1].setBookName("Java 2.0");
		bookArray[1].setBookPrice(40000);
		bookArray[1].setBookDiscountRate(3);
		
		bookArray[2] = new Book();
		bookArray[2].setBookName("JSP Servlet");
		bookArray[2].setBookPrice(60000);
		bookArray[2].setBookDiscountRate(6);
		
		for(int i=0;i<bookArray.length;i++) {
			bookArray[i].print();
		}
		System.out.println();
		int sum = 0;
		for(int i=0;i<bookArray.length;i++) {
			sum = sum + bookArray[i].getBookPrice();
		}
		double sum1 = 0;
		for(int i=0;i<bookArray.length;i++) {
			sum1 = sum1 + bookArray[i].getDiscountBookPrice();
		}
		
		System.out.println("책 가격의 합:"+sum+"원");
		System.out.println("할인 된 책 가격의 합:"+sum1+"원");
	}
}
