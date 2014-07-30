package me.dec7.composite;

import me.dec7.composite.client.Waitress;
import me.dec7.composite.component.MenuComponent;
import me.dec7.composite.composite.Menu;
import me.dec7.composite.leaf.MenuItem;


public class Main {

	public static void main(String[] args) {
		
		MenuComponent allMenus = new Menu("전체 메뉴", "전체");
		
		MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
		allMenus.add(pancakeHouseMenu);
		
		MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
		allMenus.add(dinerMenu);
		
		MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
		allMenus.add(cafeMenu);
		
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트, 디저트!~");
		allMenus.add(dessertMenu);
		
		
		// 메뉴 추가
		cafeMenu.add(new MenuItem("베지버고와 에어프라이", "통일빵, 상추, 토마토 첨가된 버거", true, 3.99));
		cafeMenu.add(new MenuItem("오늘의 스프", "샐러드가 곁들여진 스프", false, 3.69));
		cafeMenu.add(new MenuItem("베리또", "통 핀토콩과 살사, 등 곁들여짐", true, 4.29));
		
		pancakeHouseMenu.add(new MenuItem("k&B 팬케이크 세트", "스크램블 에드와 토스트를 곁들인 팬케이크", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("레귤러 팬케이크 세트", "후라이, 소시지 팬케이크", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("블루베리 팬케이크", "블루베리, 시럽 팬케이크", true, 3.29));
		pancakeHouseMenu.add(new MenuItem("와플", "와플, 취향에 따른 블루베리, 딸기 얹어라", true, 3.59));
		
		dinerMenu.add(new MenuItem("채식주의자용 BLT", "통밀, 베이컨, 상추 등등", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "통밀 베이컨 토마토", false, 2.99));
		dinerMenu.add(new MenuItem("오늘의 스프", "감자 샐러드 곁들인 오늘의 스프", false, 3.29));
		dinerMenu.add(new MenuItem("핫도그", "사웤라우크 양념, 양파", false, 3.05));
		
		dessertMenu.add(new MenuItem("커피", "코페아 바닐라 라떼", false, 10.55));
		dessertMenu.add(new MenuItem("아이스크림", "오렌지마트 떨이", false, 50));
		dessertMenu.add(new MenuItem("콜라", "중독성 짱", false, 200));
		
		
		// client
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();

	}

}
