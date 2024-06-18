package impuestos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImpuestosTest {

	@Test
	void testCalcularImpuesto() {
		Impuestos impuestoAgua = new Impuestos(50, 50);
		double result = impuestoAgua.calcularImpuesto();
		assertEquals(2500.0, result);
	}

}
