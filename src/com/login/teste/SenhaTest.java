package com.login.teste;
import static org.junit.Assert.*;
import org.junit.Test;
import com.login.Senha;

public class SenhaTest extends Senha{
	private Senha senha = new Senha();

		@Test
		public void testarSenhaInvalida() {
		assertFalse("Retorna False - senha invalido",senha.validarSenha("$%$%"));
		assertFalse("Reterona False- senha em Branco",senha.validarSenha(""));
		assertFalse("Reterona False- senha Invalido",senha.validarSenha("2345"));
		

		} 
		@Test
		public void testarSenhaValida(){
		assertTrue("Retorna True - senha correto",senha.validarSenha("123"));
		}
		
		
		
	}
