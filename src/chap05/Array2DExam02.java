package chap05;
public class Array2DExam02 {
	public static void main(String[] args) {
		int[][] arr2 = {
							{5,5,5,5,5},
							{10,10,10,10,10},
							{20,20,20,20,20},
							{30,30,30,30,30}
						};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int outer=0;outer<arr2.length;outer++) {
			for(int i=0;i<arr2[outer].length;i++) {
				sum = sum + arr2[outer][i];
				count++;
			}
		}
		
		
		System.out.println("ÃÑÇÕ=>"+sum+", count =>"+count);
		System.out.println("Æò±Õ=>"+(double)sum / (arr2.length*arr2[0].length));
		avg = (double)sum/count;
		System.out.println("Æò±Õ=>"+avg);
	}
}
