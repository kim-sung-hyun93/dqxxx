package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time 변수에 저장된 값은 초 데이터이다.
		//____시간 ____분 ____초  의 형태로 출력하기.
		int time = 8888;	
		int hour = time / 3600 ;
		int min = (time-3600*hour) / 60 ;
		int sec = (time % 60) ;
		System.out.println(hour+"시간 "+min+"분 "+sec+"초");
	}
}