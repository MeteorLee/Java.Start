package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addsubject("국어", 50);
		studentLee.addsubject("수학", 70);
		
		studentLee.showStudentInfo();
		
		System.out.println();
		
		Student studentKim = new Student(1001, "kim");
		studentKim.addsubject("과학", 60);
		studentKim.addsubject("수학", 70);
		studentKim.addsubject("영어", 90);

		
		studentKim.showStudentInfo();
		
		
	}

}
