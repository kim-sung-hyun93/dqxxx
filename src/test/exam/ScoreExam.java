package test.exam;
public class ScoreExam
{
	public static void main(String[] args){
		int kor = 82;
		int math = 95;
		int eng = 93;
		int total = kor + math + eng;
		int avg = total / 3;
		System.out.println("ÃÑÁ¡ => "+total);
		System.out.println("Æò±Õ => "+avg);
	}
}