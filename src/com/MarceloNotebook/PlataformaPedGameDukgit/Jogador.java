package com.MarceloNotebook.PlataformaPedGameDukgit;

import javax.swing.JOptionPane;

public class Jogador {
	String nome;
	int pontuacao;

	public void setNome() {
		this.nome = JOptionPane.showInputDialog("Digite seu Nome");

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
}
