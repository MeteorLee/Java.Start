package witharrylist;

public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	public GoldCustomer() {
		
		customerGrade = "Gold";
		bonusRatio = 0.03;
		saleRatio = 0.1;
	}
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		
		customerGrade = "Gold";
		bonusRatio = 0.03;
		saleRatio = 0.1;
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	
}
