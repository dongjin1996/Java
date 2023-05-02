package market.project;

import java.util.ArrayList;

public class ItemSell {
	
	private static ArrayList<Item> ItemList = new ArrayList<>();

	public static void main(String[] args) {
		//캔디류
		Item itemMychu = new Item(10010, "마이쮸");
		
		//스낵류 
		Item itemCorn = new SnackItem(10020, "콘칩");
		Item itemPotato = new SnackItem(10030, "감자칩");
		
		//드링크류		
		Item itemCola = new DrinkItem(10040, "콜라");
		
		//빵류
		Item itemBread = new BreadItem(10050, "빵", "칫솔");
		
		ItemList.add(itemMychu);
		ItemList.add(itemCorn);
		ItemList.add(itemPotato);
		ItemList.add(itemCola);
		ItemList.add(itemBread);
		
		showAllItem();
		
		Item item = findItem(10050); //빵
		
		if(item == null) {
			System.out.println("존재하지 않는 상품입니다.");
		} else {
			showPriceBonus(item, 8000);
		}
	}
	
	public static void showAllItem() {
		System.out.println("=============모든 상품 정보 풀력 =============");
		
		for(Item item : ItemList) {
			System.out.println(item.showItemInfo());
		}
	}
	
	public static Item findItem(int itemID) {
		Item resultItem = null;
		
		for(Item item : ItemList) {
			if(item.getItemID() == itemID) {
				resultItem = item;
				break;
			}
		}
		
		return resultItem;
	}
	
	public static void showPriceBonus(Item item, int price) {
		System.out.println("========상품의 할인율과 적립 포인트=========");
		
		int cost = item.calcPrice(price);
		
		System.out.println(item.getItemName() + "상품의 지불금액: " + cost + "원");
		System.out.println(item.getItemName() + "상품의 현재 적립 포인트: " + item.bonusPoint + "점");
	}
}
