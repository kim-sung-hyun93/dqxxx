package workBook;

public class ShapeTest {
	public static void main(String[] args) {
		//ShapeŸ���� ��ü�� ������ �� �ִ� ���� 6���� �迭�� ����.
		Shape shape[] = new Shape[7];
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		shape[6] = new Circle(0, 0, "White", 5);
		
		System.out.println("�⺻����");
		for(int i=0; i<shape.length; i++) {
//			System.out.println(shape[i].getClass().getName()+"\t"+
//					shape[i].getArea()+"\t"+shape[i].getColors());
			//�迭�� ����� ��ü�� Ÿ���� �˻�
			String name ="";
			if(shape[i] instanceof Triangle) {
				name = "Triangle";
			}else if(shape[i] instanceof Rectangle) {
				name = "Rectangle";
			} else if(shape[i] instanceof Circle) {
				name = "Circle";
			}
			System.out.println(name+"\t"+shape[i].getArea()+"\t"+shape[i].getColors());
			//�ִ��� �̷��� �ڵ带 �������� �ʰԲ� ¥��.
		}
		
		System.out.println();
		System.out.println("����� ���� �� ����");
		
		/*for(int i=0; i<shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				((Triangle)shape[i]).setResize(5);
			}else if(shape[i] instanceof Rectangle){
				((Rectangle)shape[i]).setResize(5);
			}
			System.out.println(shape[i].getArea()+"\t"+shape[i].getColors());
		}*/
		
		//���� for�� - 5.0���� �߰��� for��
		//�迭�̳� Collection�� �ٷ� �� ���
		//for���� �� �� ���� �� ������ shape�迭���� ��� �ϳ��� ������ obj�� ���� �� �۾�
		for (Shape obj : shape) {
			//System.out.println(obj.getArea()+"\t"+obj.getColors()); //obj = shape[i]
			//��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶� ��ü�� Ÿ���� üũ�� �Ŀ� �����Ѵ�.
			String name = "";
			if(obj instanceof Rectangle) {
				((Rectangle)obj).setResize(5);
				name = "Rectangle";
			} else if(obj instanceof Triangle) {
				((Triangle)obj).setResize(5);
				name = "Triangle";
			} else if(obj instanceof Circle) {
				((Circle)obj).setResize(5);
				name = "Circle";
			}
			System.out.println((name+"\t"+obj.getArea()+"\t"+obj.getColors()));
		}
			
	}
}
