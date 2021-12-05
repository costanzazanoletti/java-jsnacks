package jsnacks.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangoloTest {
	
	
	Triangolo t;
	@BeforeEach
	void setUp() {
		t = new Triangolo();
	}
	
	@Test
	void verificaTriangoloTest() {
		assertTrue(t.verificaTriangolo(3, 4, 5));
		assertFalse(t.verificaTriangolo(2, 3, 8));
	}

}
