package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName  = studentName;
		this.money = money;
	}
	// 협업
	// Bus라는 객체를 받아서 Bus객체의 메소드를 호출가능해짐
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
		
	}

	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
		
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + " 입니다. ");
	}
}
