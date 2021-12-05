package jsnacks.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CandyProblemTest {

	private CandyProblem cp;
	
	@BeforeEach
	void setup() {
		cp = new CandyProblem();
	}
	
	@Test
	void candiesToGiveTest() {
		int[] candies = new int[] {5,8,6,4};
		assertEquals(cp.candiesToGive(candies), 9);
		candies = new int[] {0,10,5,10};
		assertEquals(cp.candiesToGive(candies), 15);
		candies = new int[] {10,10,10,10};
		assertEquals(cp.candiesToGive(candies), 0);
	}

}
