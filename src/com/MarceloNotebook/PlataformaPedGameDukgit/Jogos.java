package com.MarceloNotebook.PlataformaPedGameDukgit;

import javax.swing.JOptionPane;

public class Jogos {
	int pontuacao = 0;

	public String aprendaComprando(String nome, Jogador jogador) {

		pontuacao = 5;
		jogador.setNome(nome);
		jogador.setPontuacao(pontuacao);

		return "Aprenda Comprando";
	}

	public String jogoDasLetras(String nome, Jogador jogador) {

		pontuacao = 5;
		jogador.setNome(nome);
		jogador.setPontuacao(pontuacao);

		return "Jogo das Letras";
	}

}
