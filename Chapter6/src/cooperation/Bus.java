package cooperation;

public class Bus {

	int  busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	public void showinfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은" 
				+ money + "입니다.");
	}
}
