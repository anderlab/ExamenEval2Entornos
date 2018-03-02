
import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma {

	@Test
	public void test() {
		Matematica m = new Matematica();
		int a = 1;
		int b = 2;
		int resultado = m.suma(a, b);

		int esperado = 3;

		assertEquals(esperado, resultado);

	}

}
