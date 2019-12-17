package chap08;

public class CalcTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		Calculator cal = new Calculator();
		double result = cal.divide(a, b);
		System.out.println("°á°ú :"+result);
	}
}
