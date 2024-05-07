package tests;

import static org.junit.jupiter.api.Assertions.*;
import util.misArrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Junit_testMaxima {
	
	private static int[] arrayValido;
    private static int[] arrayInvalido;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arrayValido = new int[]{8, 7, 9, 10, 5};
        arrayInvalido = new int[]{8, 7, 11, 10, 5};
	}

	@Test
	void testValido() {
		int max = misArrays.maximaNota(arrayValido);
        assertEquals(10, max);
	}
	
	@Test
	void testInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
            misArrays.maximaNota(arrayInvalido);
        });
	}

}
