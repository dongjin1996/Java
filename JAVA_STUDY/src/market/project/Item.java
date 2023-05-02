package market.project;

public class Item {
	
	protected int itemID; //상품 아이디
	protected String itemName; //상품 이름
	protected String itemValue; //상품 종류
	int bonusPoint; // 적립 포인트
	double bonusRatio; //적립 비율
	
	//생성자
	public Item() {
		initItem();
	}
	public Item(int itemID, String itemName) {
		this.itemID = itemID;
		this.itemName = itemName;
		initItem();
	}
	
	//메소드
	private void initItem() {
		itemValue = "CANDY";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
			return price;
	}
	
	public String showItemInfo() {
		return itemName + "상품의 종류: " + itemValue + "적립 포인트: " + bonusPoint + "점";
	}
	
	
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemValue() {
		return itemValue;
	}
	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}
	
	
}
