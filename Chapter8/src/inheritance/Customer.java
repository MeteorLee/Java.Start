package inheritance;

public class Customer {

	protected int customerID;		// private이지만 상속관계에서만 public으로 됨
	protected String customerName;	// 다른 패키지에 존재해도 public으로 쓸 수 있음
	protected String customerGrade;
	int bonusPoint;					// default 이므로 다른 패키지에서는 상속이 안됨
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID =customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는"
				+ bonusPoint + "입니다.";
	}

	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerIdD) {
		this.customerID = customerIdD;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
