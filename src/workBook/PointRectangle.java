package workBook;

public class PointRectangle extends PointShape implements Movable{
	private int width;
	
	public PointRectangle() {
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public PointRectangle(int width, int x, int y) {
		super(new Point(x,y));
		this.width = width;
	}
	
	public double getArea() {
		return point.getX()*point.getY();
	}
	
	public double getCircumference() {
		return 2*(point.getX()*point.getY());
	}
	
	public void move(int x, int y) {
		point.setX(point.getX()+x+2);
		point.setY(point.getY()+y+2);
	}
	
	public String printInfo() {
		String res = getWidth()+"\t"+point.getX()+"\t"+point.getY();
		return res;
	}

}
