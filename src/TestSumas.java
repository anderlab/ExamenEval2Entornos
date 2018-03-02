import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestSumas {

	@Test
	public void test() {
		ArrayList sumas = new ArrayList();
		
		Matematica m = new Matematica();
		int a = 1;
		int b = 2;
		int resultado = m.suma(a, b);
		sumas.add(resultado);

		

		assertSame(m.sumas().get(0),3 );

	}
}
