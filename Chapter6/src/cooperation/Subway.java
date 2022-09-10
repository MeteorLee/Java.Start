package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNum) {
		this.lineNumber = lineNum;
	}
	
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	public void showinfo() {
		System.out.println(lineNumber + "호선 지하철의 승객은 " + passengerCount + "명이고, 수입은" 
				+ money + "입니다.");
	}
}
