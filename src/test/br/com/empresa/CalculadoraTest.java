package test.br.com.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.empresa.Calculadora;

public class CalculadoraTest {

	@Test
	public void SomaDeDoisInteiros() {
		Calculadora calculadora = new Calculadora();
		assertEquals(5, calculadora.soma(2,3));
	}

}
