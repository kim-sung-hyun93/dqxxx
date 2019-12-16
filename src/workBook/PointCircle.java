package workBook;

public class PointCircle extends PointShape implements Movable{
	private int radius;
	
	public PointCircle() {
		
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public PointCircle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius = radius;
	}
	
	public double getArea() {
		return point.getX()*point.getY();
	}
	
	public double getCircumference() {
		return 2*Math.PI*getRadius();
	}
	
	public void move(int x, int y) {
		point.setX(point.getX()+x+1);
		point.setY(point.getY()+y+1);
	}
	
	public String printInfo() {
		String res = getRadius()+"\t"+point.getX()+"\t"+point.getY();
		return res;
	}
	
}
