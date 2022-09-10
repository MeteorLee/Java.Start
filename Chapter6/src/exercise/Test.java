package exercise;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student("이순신", 3000, 3);
		Student s2 = new Student("이세종", 5000, 2);
		
		Bus b1 = new Bus(305, 14, 100000);
		Subway sb1 = new Subway(1, 40, 80000);
		
		s1.studentInfo();
		s2.studentInfo();
		
		b1.busInfo();
		sb1.SubwayInfo();
		
		System.out.println("      ");
		System.out.println("      ");
		System.out.println("      ");
		
		s1.rideBus(b1);
		s2.rideSub(sb1);
		
		s1.studentInfo();
		s2.studentInfo();
		
		b1.busInfo();
		sb1.SubwayInfo();
		
	}

}
