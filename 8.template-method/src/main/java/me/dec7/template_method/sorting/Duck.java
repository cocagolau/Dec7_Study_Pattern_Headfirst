package me.dec7.template_method.sorting;

public class Duck implements Comparable {

	private int weight;
	private String name;

	public Duck (String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	
	
	@Override
	public String toString() {
		
		return this.name + ", 체중: " + this.weight;
	}


	public int compareTo(Object obj) {
		
		Duck otherDuck = (Duck)obj;
		
		if (this.weight < otherDuck.weight) {
			
			return -1;
					
		} else if (this.weight == otherDuck.weight) {
			
			return 0;
			
		} else {
			
			return 1;
			
		}
		
	}

}
