package workBook;
public class MobileTest {
	public static void main(String[] args) {
		Ltab ltab = new Ltab("Ltab", 500, "AP-01");
		Otab otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
		System.out.println("----------------------------------");
		ltab.print();
		otab.print();
		System.out.println();
		
		System.out.println("10분충전");
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
		System.out.println("----------------------------------");
		ltab.charge(10);
		otab.charge(10);
		ltab.printcharge();
		otab.printcharge();
		System.out.println();
		
		System.out.println("5분 통화");
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
		System.out.println("----------------------------------");
		ltab.operate(5);
		otab.operate(5);
		ltab.printcall();
		otab.printcall();
	}
}
