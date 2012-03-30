package com.MarceloNotebook.PlataformaPedGameDukgit;

public class GameDuqueFachada {
	Jogador j = new Jogador();

	private Jogos jogo;

	public void iniciarJogo() {
		this.jogo = new Jogos();
	}

	public void criarJogador() {
		this.j.setNome();

	}

	public void selecionarJogo() {
		this.jogo.escolheJogo();
	}

}
