package jsnacks.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutoTest {

	@Test
	void testViaggia() {
		Auto auto = new Auto("Toyota", "Yaris", "XY123KJ");
		auto.viaggia(120);
		auto.viaggia(65);
		assertEquals(auto.getChilometraggio(), 185);
		
	}

}
