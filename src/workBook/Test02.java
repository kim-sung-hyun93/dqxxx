package workBook;

public class Test02 {
	public static void main(String[] args) {
		
		//Company의 salary가 double이고 입력받은 salary가 int이므로 자동 캐스팅이 된다.
		int salary = Integer.parseInt(args[0]);
		Company c= new Company(salary);
		
		c.print();
		c.printbonus();
		c.printtotal();
	}
}
