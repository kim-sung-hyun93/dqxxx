package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time ������ ����� ���� �� �������̴�.
		//____�ð� ____�� ____��  �� ���·� ����ϱ�.
		int time = 8888;	
		int hour = time / 3600 ;
		int min = (time-3600*hour) / 60 ;
		int sec = (time % 60) ;
		System.out.println(hour+"�ð� "+min+"�� "+sec+"��");
	}
}