package jsnacks.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HammingDistanceTest {
	private HammingDistance hd;
	
	@BeforeEach
	void setup() {
		hd = new HammingDistance();
	}
	
	@Test
	void computeHammingDistanceTest() {
		assertEquals(hd.computeHammingDistance("AbcDefG", "abcdefg"), 3);
		assertEquals(hd.computeHammingDistance("Hamming", "Hamming"), 0);
	}

}
