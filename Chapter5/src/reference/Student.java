package reference;

public class Student {

	int studentID;
	String studentName;
	
	
//	int koreaScore;
//	int mathScore;
//	String koreaSubject;
//	String mathSubject;
//	
//	int engScore;
//	String Subject;
//	이 부분들은 다른 클래스에 할당할꺼임
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id , String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
		
//		korea.subjectName = name; 이렇게도 가능함
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() +math.getScore();
		System.out.println(studentName + "학생의 총점은 : " + total);
	}
}
