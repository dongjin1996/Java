package customer.project;

public class VipCustomer extends Customer{
	double saleRatio; //할인률
	private int agentID; //상담원 아이디
	
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}
	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	
}
