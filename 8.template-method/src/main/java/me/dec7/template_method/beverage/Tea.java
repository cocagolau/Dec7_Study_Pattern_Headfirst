package me.dec7.template_method.beverage;

import me.dec7.template_method.beverage.template.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
	
	@Override
	public void brew() {
		System.out.println("차를 우려내는 중");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("레몬을 추가하는 중");
		
	}
}
