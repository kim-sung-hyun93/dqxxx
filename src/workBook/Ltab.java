package workBook;

public class Ltab extends Mobile{
	public Ltab() {
		
	}
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	public void print() {
		System.out.println(getMobileName()+"\t"+getBatterySize()+
				"\t"+getOsType());
	}
	public void printcharge() {
		System.out.println(getMobileName()+"\t"+getBatterySize()+
				"\t"+getOsType());
	}
	public void printcall() {
		System.out.println(getMobileName()+"\t"+getBatterySize()+
				"\t"+getOsType());
	}
}
