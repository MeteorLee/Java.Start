package exercise;

public class Subway {
	int number;
	int passenger;
	int money;
	
	public Subway(int number, int passenger, int money) {
		this.money = money;
		this.number = number;
		this.passenger = passenger;
	}
	public void pickUp() {
		this.money = money + 1000;
		this.passenger = passenger + 1;
	}
	public void SubwayInfo() {
		System.out.println(number + "호선 지하철은 " + money +"원 돈을 가지고 "
							+ passenger + " 명을 태움");
	}
}
