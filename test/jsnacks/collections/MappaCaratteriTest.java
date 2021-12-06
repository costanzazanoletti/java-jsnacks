package jsnacks.collections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MappaCaratteriTest {

	@Test
	void mappaCaratteriTest() {
		MappaCaratteri mc = new MappaCaratteri();
		String s = "Barbapapa";
		assertEquals(mc.mappaCaratteri(s).size(), 5);
		assertEquals(mc.mappaCaratteri(s).get('a'), 4);
		
	}

}
