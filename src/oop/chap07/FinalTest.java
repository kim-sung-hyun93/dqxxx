package oop.chap07;
final class FinalSuper{
	public final void display() {
		System.out.println("super display");
	}
}

/*class FinalSub extends FinalSuper{ //finalŬ������ ����� �Ұ���
	static final int NUM = 100; // ����� �빮�ڷ� ����!

	@Override //[������̼�] �����Ϸ����� �˷��ֱ� ���� ��ȣ.
	public void display() { //final �޼ҵ�� �������̵� �� �� ����.
		System.out.println("display");
	}
	
}*/

/*public class FinalTest {
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
//		obj.num = 1000;  // final�� ���ǵ� num�� ��� �̹Ƿ� ���� ������ �� ����.
		System.out.println(FinalSub.NUM);
		obj.display();
	}
}
*/