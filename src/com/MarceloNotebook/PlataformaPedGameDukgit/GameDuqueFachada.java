package com.MarceloNotebook.PlataformaPedGameDukgit;

public class GameDuqueFachada {

	private SelecionaJogos sj;
	private boolean ij;
	private QuestaoJL palavra;
	private QuestaoAPC pergunta;

	public GameDuqueFachada() {
		this.sj = new SelecionaJogos();
		this.palavra = new QuestaoJL();
		this.pergunta = new QuestaoAPC();
	}

	public void iniciaJogo(boolean b) {
		this.ij = b;
	}

	public boolean jogoNaoAcabau() {
		return this.ij;
	}

	public void criarJogador(String nome) {
		this.jr.setNome(nome);

	}

	public String jogador() {
		return this.jr.getNome();
	}

	public boolean jogadorCriado() {
		return this.jr.jogadorCriado();
	}

	public void selecionarJogo(int cod) {
		sj.selecionaJogo(cod, this.jr.getNome());

	}

	public String jogoSelecionado() {
		return sj.jogoescolhido(this.jr);
	}

	public void fechaJogo() {
		sj.fechaJogo();
	}

	public QuestaoAPC AprendaComprando(int resposta) {
		this.pergunta.setResposta(resposta);
		return this.pergunta;
	}

	public QuestaoJL JogoDasLetras(int posicao, String letra) {
		this.palavra.setResposta(posicao, letra);
		return this.palavra;
	}

}
