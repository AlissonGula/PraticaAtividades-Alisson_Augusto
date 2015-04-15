package br.senai.sc.ultil;

import junit.framework.TestCase;

import org.junit.Test;

import br.sc.senai.ultil.ValidadorCPF;

public class ValidadorCPFTest extends TestCase {

	@Test
	public static void testRetiraCaracteresInvalidosComPonto() {

		String cpfParaValidar = "292.604.32600";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("29260432600", cpfApenasNumeros);
	}

	@Test
	public static void testRetiraCaracteresInvalidosComLetras() {

		String cpfParaValidar = "292.604cdjhdjsfhdskd.326-00";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("29260432600", cpfApenasNumeros);
	}

	@Test
	public static void testRetiraCaracteresInvalidosComSimbolosEspecias() {

		String cpfParaValidar = "2926%%%%04))3++++26=====00";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("29260432600", cpfApenasNumeros);
	}
	
	@Test
	public static void testRetiraCaracteresInvalidosComHifen() {

		String cpfParaValidar = "292604326-00";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("29260432600", cpfApenasNumeros);
	}
	
	@Test
	public static void testIsCPFPadraoTest1ComPonto(){
		String cpfParaValidar = "292604.326.00";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue (digitos);
		
		}
	
	@Test
	public static void testIsCPFPadraoTest2ComHifen(){
		String cpfParaValidar = "292604326-00";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue (digitos);
		
		}
	@Test
	public static void testIsCPFPadraoTest3ComSimbolos(){
		String cpfParaValidar = "292604326$$$$$00";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue (digitos);
		
		}
	
	@Test
	public static void testIsCPFPadraoTest4ComLetra(){
		String cpfParaValidar = "292604326dekskjs00";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue (digitos);
		
	}
}
