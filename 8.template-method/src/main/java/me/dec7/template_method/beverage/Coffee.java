package me.dec7.template_method.beverage;

public class Coffee extends CaffeineBeverage{
	
	@Override
	void brew() {
		System.out.println("필터를 통해 커피를 우려내는 중");
		
	}

	@Override
	void addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중");
		
	}
}
