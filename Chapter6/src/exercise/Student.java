package exercise;

public class Student {
	String name;
	int money;
	int grade;
	
	public Student(String name, int money, int grade ) {
		this.name = name;
		this.money = money;
		this.grade = grade;
	}
	public void rideBus(Bus bus) {
		bus.pickUp();
		this.money = money - 1000;
	}
	
	public void rideSub(Subway subway) {
		subway.pickUp();
		this.money = money - 800;
	}
	
	public void studentInfo() {
		System.out.println(name + " 학생의 돈은" + money);
	}
	
}