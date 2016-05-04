package com.login.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import com.login.Login;

public class LoginTest extends Login {
	private Login login = new Login();
	
	@Test
	public void testLoginCorreto() {
		assertTrue("Retorna true - Login valido",login.validarLogin("123"));
	}
	
	public void testLoginIncorreto(){
		assertFalse("Retorna False - Login invalido",login.validarLogin("1234"));
		assertFalse("Reterona False- Login em Branco",login.validarLogin(""));
		assertFalse("Reterona False- Login Invalido",login.validarLogin(null));
		
	}
	
}
