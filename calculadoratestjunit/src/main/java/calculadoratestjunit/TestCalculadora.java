package calculadoratestjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	public Calculadora cal = new Calculadora();
		@Test
		public void test() {
			int SubtrairComSucesso = cal.subtrair(2, 2);
			assertEquals(0,SubtrairComSucesso);
		}
		
		@Test
		public void test2() {
			int SomarDoisValores = cal.somar(2, 2);
			assertEquals(4,SomarDoisValores);
	}
		@Test
		public void test3() {
			int MultiplicarValores = cal.multiplicar(2, 2);
			assertEquals(4,MultiplicarValores);
	}
		@Test
		public void test4() {
			int DivisaoNumeros = cal.dividir(2, 2);
			assertEquals(1,DivisaoNumeros);
	}
		@Test
		public void test5() {
			double PotenciaDeDoisValores = cal.potenciar(2, 2);
			assertEquals(4.0,PotenciaDeDoisValores,0);
	}
}
