package workBook;

public class Test02 {
	public static void main(String[] args) {
		
		//Company�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ� �ڵ� ĳ������ �ȴ�.
		int salary = Integer.parseInt(args[0]);
		Company c= new Company(salary);
		
		c.print();
		c.printbonus();
		c.printtotal();
	}
}
