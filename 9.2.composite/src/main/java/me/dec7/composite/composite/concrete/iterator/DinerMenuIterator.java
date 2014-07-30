package me.dec7.composite.composite.concrete.iterator;

import java.util.Iterator;

import me.dec7.composite.leaf.MenuItem;

public class DinerMenuIterator implements Iterator {
	
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
		
		if (this.position >= items.length || items[position] == null) {
			
			return false;
			
		} else {
			
			return true;
			
		}
	}

	public Object next() {
		MenuItem menuItem = this.items[position++];
		
		return menuItem;
	
	}

	public void remove() {
		
		if (position <= 0) {
			
			throw new IllegalStateException("next()를 호출전에 삭제 불가함.");
			
		}
		
		if (items[position-1] != null) {
			for (int i=position-1; i<(items.length-1); i++) {
				items[i] = items[i+1];
			}
			items[items.length-1] = null;
		}
		
	}

}
