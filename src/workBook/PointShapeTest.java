package workBook;

public class PointShapeTest {
	public static void main(String[] args) {
		PointShape shape[] =  new PointShape[4];
		shape[0] =  new PointRectangle(4, 7, 5);
		shape[1] =  new PointRectangle(5, 4, 6);
		shape[2] =  new PointCircle(6, 6, 7);
		shape[3] =  new PointCircle(7, 8, 3);
		
		for (int i = 0; i < shape.length; i++) {
			if (shape[i] instanceof PointRectangle) {
				System.out.print("Rectangle: ");
				System.out.println(  ((PointRectangle)shape[i]).printInfo()  );
			} else if (shape[i] instanceof PointCircle) {
				System.out.print("Triangle: ");
				System.out.println(((PointCircle)shape[i]).printInfo());
			}
		}
		System.out.println("After Move ..................");
		
		for (int i = 0; i < shape.length; i++) {
			if (shape[i] instanceof PointRectangle) {
				((PointRectangle)shape[i]).move(10, 10);
				System.out.print("Rectangle: ");
				System.out.println(  ((PointRectangle)shape[i]).printInfo()  );
			} else if (shape[i] instanceof PointCircle) {
				((PointCircle)shape[i]).move(10, 10);
				System.out.print("Triangle: ");
				System.out.println(((PointCircle)shape[i]).printInfo());
			}
		}
	}
}
