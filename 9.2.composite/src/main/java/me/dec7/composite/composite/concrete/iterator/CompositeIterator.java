package me.dec7.composite.composite.concrete.iterator;

import java.util.Iterator;
import java.util.Stack;

import me.dec7.composite.component.MenuComponent;
import me.dec7.composite.composite.Menu;

public class CompositeIterator implements Iterator {

	Stack<Iterator> stack = new Stack<Iterator>();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	public Object next() {
		
		if (this.hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			
			return component;
			
		} else {
			
			return null;
			
		}
	
	}
	public boolean hasNext() {
		
		if (stack.empty()) {
			
			return false;
			
		} else {
			
			Iterator iterator = stack.peek();
			
			if (!iterator.hasNext()) {
				stack.pop();
				
				return hasNext();
				
			} else {
				
				return true;
				
			}
			
		}
		
	}


	public void remove() {
		// TODO Auto-generated method stub

	}

}
