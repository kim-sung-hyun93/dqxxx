package oop.chap06.constructor;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student1 = new Student("Kim", 100, 90, 95, 89);
		Student student2 = new Student("Lee", 60, 70, 99, 98);
		Student student3 = new Student("park", 68, 86, 60, 40);
			
		student1.print();
		student2.print();
		student3.print();
		
	}
}
