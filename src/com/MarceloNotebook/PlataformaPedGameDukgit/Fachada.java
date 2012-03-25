package com.MarceloNotebook.PlataformaPedGameDukgit;

public class Fachada {
	private Fachada fachada;

	public Fachada(){
	this.fachada = new Fachada();
	}

	public void crieSuasHistoria() {
	this.fachada.crieSuasHistorias();
	}

	public void AjudandoLeitura() {
	this.fachada.ajudandoNaLeitura();
	}

	public void jogoDasLetras() {
	this.fachada.Letras();
	}

	public void aprenda() {
	this.fachada.aprendaComprando();
	}

}
