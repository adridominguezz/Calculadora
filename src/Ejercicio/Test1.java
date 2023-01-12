package Ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {
	Calculadora calculo = new Calculadora();
	
	@Test
	public void multiplicaTest() {
		 double resultado = calculo.multiplica(2, 2);
		 double esperado = 4;
		 assertEquals (esperado, resultado);
	}

}
