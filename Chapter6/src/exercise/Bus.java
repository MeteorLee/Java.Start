package exercise;

public class Bus {
	int number;
	int passenger;
	int money;
	
	public Bus(int number, int passenger, int money) {
		this.money = money;
		this.number = number;
		this.passenger = passenger;
	}
	public void pickUp() {
		this.money = money + 1000;
		this.passenger = passenger + 1;
	}
	public void busInfo() {
		System.out.println(number + "번 버스는 " + money +"원 돈을 가지고 "
							+ passenger + " 명을 태움");
	}
}