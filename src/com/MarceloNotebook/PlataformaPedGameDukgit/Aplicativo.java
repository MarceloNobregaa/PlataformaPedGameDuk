package com.MarceloNotebook.PlataformaPedGameDukgit;

public class Aplicativo {

	public static void main(String[] args) {

		String nome = "Flavio";
		int cod = 1;
		
		GameDuqueFachada f = new GameDuqueFachada();

		f.criarJogador(nome);

		f.selecionarJogo(cod);
		
		f.jogoSelecionado();
		
		f.AprendaComprando(0);
		
		f.JogoDasLetras(1,"");

		

	}

}
