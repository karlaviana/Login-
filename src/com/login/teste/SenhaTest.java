package com.login.teste;

import static org.junit.Assert.*;
import org.junit.Test;
import com.login.Senha;


public class SenhaTest extends Senha{
	private Senha senha = new Senha();

	@Test
	public void testarSenha() {
	assertFalse("Retorna False - senha invalido",senha.validarSenha("$%$%"));
	assertFalse("Reterona False- senha em Branco",senha.validarSenha(""));
	assertFalse("Reterona False- senha Invalido",senha.validarSenha("2345"));
	assertTrue("Retorna True - senha correto",senha.ValidarsenhaIncorreto("123"));

	} 
}
