package workBook;

public class CarTest {
	public static void main(String[] args) {
		Car car[] = new Car[2];
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 75, 35, 0);
		
		System.out.println("vehicleName\t engineSize\t oilTank\t oilSize\t distance\t temperature ");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t\t"
					+ car[i].getOilSize() + "\t\t" + car[i].getDistance()+"\t\t");
			if(car[i] instanceof L3) {
				System.out.println(((L3)car[i]).getTempGage());
			}else if(car[i] instanceof L5){
				System.out.println(((L5)car[i]).getTempGage());
			}
		}
		System.out.println();
		System.out.println("25 주유");
		for(int i=0; i<car.length;i++) {
			car[i].setOil(25);
		}
		System.out.println("vehicleName\t engineSize\t oilTank\t oilSize\t distance\t temperature ");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t\t"
					+ car[i].getOilSize() + "\t\t" + car[i].getDistance()+"\t\t");
			if(car[i] instanceof L3) {
				System.out.println(((L3)car[i]).getTempGage());
			}else if(car[i] instanceof L5){
				System.out.println(((L5)car[i]).getTempGage());
			}
		}
		System.out.println();
		System.out.println("80 주행");
		for(int i=0; i<car.length;i++) {
			car[i].go(80);
		}
		System.out.println("vehicleName\t engineSize\t oilTank\t oilSize\t distance\t temperature ");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t\t"
					+ car[i].getOilSize() + "\t\t" + car[i].getDistance()+"\t\t");
			if(car[i] instanceof L3) {
				System.out.println(((L3)car[i]).getTempGage());
			}else if(car[i] instanceof L5){
				System.out.println(((L5)car[i]).getTempGage());
			}
		}
	}
}
