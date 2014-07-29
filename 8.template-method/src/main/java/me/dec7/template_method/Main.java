package me.dec7.template_method;

import java.util.Arrays;

import me.dec7.template_method.sorting.Duck;

public class Main {

	public static void main(String[] args) {
		
		/*
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		System.out.println();
		
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
		System.out.println();
		
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		coffeeWithHook.prepareRecipe();
		*/
		
		
		Duck[] ducks = {
				new Duck("A", 8),
				new Duck("B", 2),
				new Duck("C", 7),
				new Duck("D", 2),
				new Duck("E", 10),
				new Duck("F", 2)
		};
		
		System.out.println("정렬 전: ");
		display(ducks);
		
		// 템플릿 메소드
		Arrays.sort(ducks);
		
		System.out.println("정렬 후: ");
		display(ducks);


	}

	private static void display(Duck[] ducks) {
		
		for (int i=0; i<ducks.length; ++i) {
			System.out.println(ducks[i]);
		}
		
	}

}
