package workBook;

public class Test02 {
	public static void main(String[] args) {
		int inx = Integer.parseInt(args[0]);
		Company c= new Company(inx);
		
		c.print();
		c.printbonus();
		c.printtotal();
	}
}
