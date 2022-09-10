package inheritance;

public class GoldCustomer extends Customer {

	
	
	public GoldCustomer() {
		
		customerGrade = "Gold";
		bonusRatio = 0.03;
		
	}
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		
		customerGrade = "Gold";
		bonusRatio = 0.03;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}
	
	
}
