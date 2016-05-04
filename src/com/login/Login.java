package com.login;

public class Login {
	public boolean validarLogin(String login) {
		if ((login== null) || (login.length()!=3)|| (login.isEmpty())){
		return false;
	}
		return true;
	}
	
}
