package iterator.pattern;

import java.util.HashMap;

public class MapIterator implements Iterator{
	HashMap<String,Object> map;

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}
}
