package com.MarceloNotebook.PlataformaPedGameDukgit;

public class SelecionaJogos {

	int cod;
	boolean novoJogo = true;
	String nomeJogador = "";
	Jogos jogos = new Jogos();

	public void selecionaJogo(int cod, String nome) {
		if (this.novoJogo) {
			this.cod = cod;
			this.nomeJogador = nome;
			this.novoJogo = false;
		} else {
			this.cod = 4;
		}
	}

	public String jogoescolhido(Jogador jogador) {

		if (this.cod == 1) {
			return jogos.aprendaComprando(nomeJogador, jogador);
		} else if (this.cod == 2) {
			return jogos.jogoDasLetras(nomeJogador, jogador);
		} else if (cod == 4) {
			return "Feche o Jogo Atual";
		}
		return "Jogo nao existe";
	}

	public boolean fechaJogo() {
		return this.novoJogo = true;
	}

}
