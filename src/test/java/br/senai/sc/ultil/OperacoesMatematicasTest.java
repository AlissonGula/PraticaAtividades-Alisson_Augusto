package br.senai.sc.ultil;

import junit.framework.TestCase;

import org.junit.Test;

import br.sc.senai.ultil.OperacoesMatematicas;

public class OperacoesMatematicasTest extends TestCase {

	@Test
	public static void testSomaDoisValoresReais(){
		double num1 = 15.6;
		double num2 = 15.4;
		double valorEsperado = 31.0;
		double valorAtual = OperacoesMatematicas.somaDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	
	@Test(expected = NumberFormatException.class) 
	public static void testSomaDoisValoresNulo(){
		try{
			OperacoesMatematicas.somaDoisValores(1d, null);
			
		} catch (Exception e ) {
			e.printStackTrace();
			
		}
		
		assertEquals(null, null);
	}

	
	
	@Test (expected = NumberFormatException.class)
	public static void testSomaDoisValoresPassandoNulo(){
		try{
			assertEquals(5d, (double) br.sc.senai.ultil.OperacoesMatematicas.somaDoisValores(5d, null));	
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public static void testSomaDoisValoresResultadoErrado(){
		double num1 = 20d;
		double num2 = 15d;
		double valorExperado = 25.00;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.somaDoisValores(num1, num2);
		assertTrue("Erro na soma dos Valores", valorExperado != valorAtual);
	}
	
	@Test
	public static void testSomaValoresMaioresErrado(){
		double num1 = 1.2235;
		double num2 = 2.0315;
		double valorExperado = 4.2555;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.somaDoisValores(num1, num2);
		assertFalse("Erro na soma dos Valores", valorExperado != valorAtual);
	}
	
	
	
	@Test
	public static void testSubtracaoDoisValoresReais(){
		double num1 = 20.5;
		double num2 = 10.5;
		double valorEsperado = 10.0;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.subtracaoDeDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	
	@Test
	public static void testSubtracaoDoisValoresInteiros() {
		double num1 = 10.0;
		double num2 = 3.0;
		double valorExperado = 20.0;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.multiplicacaoDeDoisValores(num1, num2);
		assertFalse("Erro na subtracao dos valores.", valorExperado == valorAtual);
	}
	
	
	@Test(expected = NumberFormatException.class)
	public static void testSubtracaoDoisValoresNulo() {
		try {
			br.sc.senai.ultil.OperacoesMatematicas.subtracaoDeDoisValores(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public static void testSubtracaoDoisValoresPassandoUmNulo() {
		try {
			br.sc.senai.ultil.OperacoesMatematicas.subtracaoDeDoisValores(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	
	
	@Test
	public static void testMultiplicacaoDoisValoresReais(){
		double num1 = 2.0;
		double num2 = 2.0;
		double valorEsperado = 4.0;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.multiplicacaoDeDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	
	
	@Test
	public static void testValidaMultiplicacao(){
		double num1 = 10.0;
		double num2 = 3.0;
		double valorExperado = 50.0;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.multiplicacaoDeDoisValores(num1, num2);
		assertFalse("Erro na multiplicação dos valores.", valorExperado == valorAtual);
	}
	
	
	
	

	@Test
	public static void testMultiplcaValoresMaioresErrado(){
		double num1 = 1.2235;
		double num2 = 2.0315;
		double valorExperado = 3.4855;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.multiplicacaoDeDoisValores(num1, num2);
		assertFalse("Erro na soma dos Valores", valorExperado != valorAtual);
	}
	

	
	
	@Test
	public static void testDivisaoDoisValoresReais(){
		double num1 = 10.0;
		double num2 = 2.0;
		double valorEsperado = 5.0;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.divisaoDeDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	

	@Test(expected = NumberFormatException.class)
	public static void testDivisaoDoisValoresPassandoUmNulo() {
		try {
			br.sc.senai.ultil.OperacoesMatematicas.divisaoDeDoisValores(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	
	@Test
	public static void testValidaErroDivisao(){
		double num1 = 10.0;
		double num2 = 3.0;
		double valorExperado =3.33 ;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.divisaoDeDoisValores(num1, num2);
		assertTrue("Erro na multiplicação dos valores.", valorExperado == valorAtual);
	}

	@Test
	public static void testDivisaoValoresMaioresErrado(){
		double num1 = 4.200;
		double num2 = 2.100;
		double valorExperado = 2;
		double valorAtual = br.sc.senai.ultil.OperacoesMatematicas.divisaoDeDoisValores(num1, num2);
		assertFalse("Erro na soma dos Valores", valorExperado != valorAtual);
	}


}