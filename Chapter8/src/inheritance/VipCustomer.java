package inheritance;



public class VipCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
	public VipCustomer() {
		// super(); 상위 클래스의 default comstructor을 호출해줌 자바 컴파일러가 자동으로 작성해줌
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VipCustomer() 생성자 호출");
	}
	
	public VipCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VipCustomer(int, String) 호출");
		
	}
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price = (int)Math.round(price*(1-saleRatio));
		return price;
	}
	
	
	
}
