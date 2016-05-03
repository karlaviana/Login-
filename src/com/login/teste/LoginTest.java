package com.login.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import com.login.Login;

public class LoginTest extends Login {
	private Login login = new Login();
	
	@Test
	public void testLoginCorreto() {
	    assertFalse("Retorna Falsse - Login invalido",login.validarLogin("1234"));
		assertFalse("Reterona False- Login em Branco",login.validarLogin(""));
		assertFalse("Reterona False- Login Invalido",login.validarLogin(null));
		assertTrue("Retorna True - Login correto",login.ValidarLoginIncorreto("YUYUYU"));
		
	}

}
