package workBook;

abstract public class PointShape {
	Point point;
	
	public PointShape() {
		
	}
	public PointShape(Point point) {
		this.point = point;
	}
	
	public abstract double getArea();
	
	public abstract double getCircumference();
}
