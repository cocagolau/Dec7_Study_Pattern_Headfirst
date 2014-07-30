package me.dec7.composite.composite.concrete.iterator;

import java.util.Iterator;

public class NullIterator implements Iterator {

	public boolean hasNext() {
		
		return false;
	}

	public Object next() {
		
		return null;
	}

	public void remove() {
		
		throw new UnsupportedOperationException();

	}

}
