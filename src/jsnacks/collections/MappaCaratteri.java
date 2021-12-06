package jsnacks.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MappaCaratteri {

	public Map<Character, Integer> mappaCaratteri(String s){
		Map<Character, Integer> mappaCaratteri = new TreeMap<Character, Integer>();
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(mappaCaratteri.containsKey(c)) {
					int currentVal = mappaCaratteri.get(c);
					mappaCaratteri.put(c, ++currentVal);
				} else {
					mappaCaratteri.put(c, 1);
				}
			} 
		}
		return mappaCaratteri;
	}
	
}
