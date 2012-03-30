package com.MarceloNotebook.PlataformaPedGameDukgit;

public class Aplicativo {

	public static void main(String [] args) {
		GameDuqueFachada f = new GameDuqueFachada();
		f.iniciarJogo();
		f.selecionarJogo();
		f.criarJogador();
	}
}
		