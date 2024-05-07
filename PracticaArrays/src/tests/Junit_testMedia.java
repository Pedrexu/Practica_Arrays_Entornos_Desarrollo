package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.misArrays;

class Junit_testMedia {
	
	static int [] notasValidas;
	static int [] notasInvalidas;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		notasValidas = new int[5];
		notasValidas[0] = 5;
		notasValidas[1] = 5;
		notasValidas[2] = 5;
		notasValidas[3] = 5;
		notasValidas[4] = 5;
		
		notasInvalidas = new int[5];
		notasInvalidas[0] = 8;
		notasInvalidas[1] = 4;
		notasInvalidas[2] = 12;
		notasInvalidas[3] = 5;
		notasInvalidas[4] = -1;
			
	}

	@Test
    void testMediaNotas_NotasValidas() 
    {
        float media = misArrays.mediaNotas(notasValidas);
        assertEquals(5, media); 
    }

    @Test
    void testMediaNotas_NotasNoValidas() 
    {
        assertThrows(IllegalArgumentException.class, () -> {
            misArrays.mediaNotas(notasInvalidas);
        });
    }


}