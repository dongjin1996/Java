package market.project;

public class DrinkItem extends Item{
	double saleRatio; //할인률
	
	public DrinkItem(int itemID, String itemName) {
		super(itemID, itemName);
		
		super.itemValue = "Drink";
		super.bonusRatio = 0.05;
		
		this.saleRatio = 0.2;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		
		return price - (int)(price * saleRatio);
	}
	
}
