package com.login;

public class Senha {
	public boolean validarSenha(String senha) {
		if ((senha== null) || (senha.length()!=3)|| (senha.isEmpty())){
			return false;
		}
			return true;
		

	}

}
