package primero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testArrays {

	@Test
	void test() {
		int[] entrada= {5,6,7,8,3,4};
		int[] esperada= {5,6,7,8,3,4};
		int cosa=9;
		//Son el mismo?
//		assertEquals(esperada, entrada);
		//primera forma
		for (int i = 0; i < esperada.length; i++) {
			assertEquals(esperada[i], entrada[i]);
		}
		//segunda forma
		//aqui no se pregunta si son el mismo, se pregunta si son iguales
		assertArrayEquals(esperada, entrada);
		int[] sustituto=esperada;
		assertEquals(esperada, sustituto);
	}

}
