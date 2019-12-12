package workBook;

public class Otab extends Mobile{
	public Otab() {
		
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	public int operate(int time) {
		setBatterySize(getBatterySize()-12*time);  
		return getBatterySize()-12*time;
	}
	
	public int charge(int time) {
		setBatterySize(getBatterySize()+8*time);
		return getBatterySize()+8*time;
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
