package oop.chap07;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student1 = new Student("Kim", 25, 100, 90, 95, 89);
		Student student2 = new Student("Lee", 23, 60, 70, 99, 98);
		Student student3 = new Student("park", 26, 68, 86, 60, 40);
		Teacher t1 = new Teacher("장동건", 45, "Spring");
		Staff s1 = new Staff("고소영", 21, "전산실");
		
		student1.print();
		student2.print();
		student3.print();
		t1.print();
		s1.print();
		
	}
}
