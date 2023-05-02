package market.project;

public class SnackItem extends Item{
	double saleRatio; //할인률
	
	public SnackItem(int itemID, String itemName) {
		super(itemID, itemName);
		
		super.itemValue = "Snack";
		super.bonusRatio = 0.02;
		
		this.saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		
		return price - (int)(price * saleRatio);
	}
	
	
}
