package com.MarceloNotebook.PlataformaPedGameDukgit;

public class Jogador {
	String nome = null;
	int pontuacao = 0;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;

	}

	public String getNome() {
		return this.nome;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}

	public boolean jogadorCriado() {
		if (nome == null) {
			return false;
		} else {
			return true;
		}
	}

}
