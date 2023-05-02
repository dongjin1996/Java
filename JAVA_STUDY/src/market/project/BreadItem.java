package market.project;

public class BreadItem extends Item{
	double saleRatio; 
	private String giftName; // 사은품명
	
	public BreadItem(int itemID, String itemName, String giftName) {
		super(itemID, itemName);
		
		super.itemValue = "Bread";
		super.bonusRatio = 0.05;
		
		this.saleRatio = 0.1;
		this.giftName = giftName;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showItemInfo() {
		return super.showItemInfo() + ", 사은품 명: " + giftName;
	}

	public String getGiftID() {
		return giftName;
	}

	public void setGiftID(String giftName) {
		this.giftName = giftName;
	}
	
	
	
}
