package workBook;
public class Test05 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]); 
		int c = Integer.parseInt(args[2]); 
		int d = Integer.parseInt(args[3]);
		
		Calc ca = new Calc();
		int sum = ca.clacSum(a, b, c, d);
		double avg = (double)sum/args.length;
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		
		if(90 <= avg) {
			System.out.println("A����");
		}else if(70 <= avg) {
			System.out.println("B����");
		}else if(50 <= avg) {
			System.out.println("C����");
		}else if(30 <= avg) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		}
	}
}
