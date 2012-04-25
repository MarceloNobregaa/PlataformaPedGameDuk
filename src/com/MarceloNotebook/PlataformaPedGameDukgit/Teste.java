package com.MarceloNotebook.PlataformaPedGameDukgit;

import junit.framework.Assert;

import org.junit.Test;

public class Teste {
	GameDuqueFachada aplicativo = new GameDuqueFachada();

	@Test
	public void checaInicioDoJogo() {
		aplicativo.iniciaJogo(true);
		Assert.assertTrue("jogo iniciado", aplicativo.jogoNaoAcabau());
	}

	@Test
	public void checarJogoAcabau() {
		aplicativo.iniciaJogo(false);
		Assert.assertFalse("Jogo iniciado", aplicativo.jogoNaoAcabau());
	}

	@Test
	public void criarJogador() {
		aplicativo.criarJogador("Flavio");
		Assert.assertTrue("jogador criado", aplicativo.jogadorCriado());
	}

	@Test
	public void JogadorNaoCriado() {
		aplicativo.criarJogador(null);
		Assert.assertFalse("jogador não foi criado", aplicativo.jogadorCriado());
	}

	@Test
	public void jogadorCriado() {
		aplicativo.criarJogador("Flavio");
		Assert.assertEquals("Flavio", aplicativo.jogador());
	}

	@Test
	public void escolherPrimeiroJogo() {
		aplicativo.selecionarJogo(1);

		Assert.assertEquals("Aprenda Comprando", aplicativo.jogoSelecionado());
	}

	@Test
	public void escolheSegundoJogo() {
		aplicativo.selecionarJogo(2);
		Assert.assertEquals("Jogo das Letras", aplicativo.jogoSelecionado());
	}

	@Test
	public void escolheJogoErrado() {
		aplicativo.selecionarJogo(3);
		Assert.assertEquals("Jogo nao existe", aplicativo.jogoSelecionado());
	}

	@Test
	public void EscolherDoisJogosAoMesmoTempo() {
		aplicativo.selecionarJogo(1);
		Assert.assertEquals("Aprenda Comprando", aplicativo.jogoSelecionado());
		aplicativo.selecionarJogo(2);
		Assert.assertEquals("Feche o Jogo Atual", aplicativo.jogoSelecionado());
	}

	@Test
	public void EscolherNovoJogo() {
		aplicativo.selecionarJogo(1);
		Assert.assertEquals("Aprenda Comprando", aplicativo.jogoSelecionado());
		aplicativo.fechaJogo();
		aplicativo.selecionarJogo(2);
		Assert.assertEquals("Jogo das Letras", aplicativo.jogoSelecionado());
	}

	@Test
	public void verJogadorDepoisDeiniciarUmJogo(){
		aplicativo.iniciaJogo(true);
		Assert.assertTrue("jogo iniciado",aplicativo.jogoNaoAcabau());
		aplicativo.criarJogador("Flavio");
		Assert.assertTrue("jogador foi criado",aplicativo.jogadorCriado());
		aplicativo.selecionarJogo(1);
		Assert.assertEquals("Aprenda Comprando", aplicativo.jogoSelecionado());
		Assert.assertEquals("Flavio",aplicativo.jr.getNome());
		Assert.assertEquals(5, aplicativo.jr.getPontuacao());
		
	}

	@Test
	public void PerguntaAprendaComprando() {
		QuestaoAPC pergunta = new QuestaoAPC();
		pergunta = aplicativo.AprendaComprando(0);
		Assert.assertEquals("2+2", pergunta.Pergunta());
	}

	@Test
	public void RespostaCertaAprendaComprando() {
		QuestaoAPC resposta = new QuestaoAPC();
		resposta = aplicativo.AprendaComprando(4);
		Assert.assertTrue("Resposta Certa", resposta.resposta());
	}

	@Test
	public void RespostaErradaAPC() {
		QuestaoAPC resposta = new QuestaoAPC();
		resposta = aplicativo.AprendaComprando(3);
		Assert.assertFalse("Resposta Errada", resposta.resposta());
	}

	@Test
	public void PalavraJogoDasLetras() {
		QuestaoJL questaoJL = new QuestaoJL();
		String[] palavra = new String[] { "C", "A", "S", "A" };
		questaoJL = aplicativo.JogoDasLetras(1, palavra[0]);
		Assert.assertEquals("CASA", questaoJL.getpalavra());

	}

	@Test
	public void LetraCertaJogoDasLetras() {
		QuestaoJL questaoJL = new QuestaoJL();
		questaoJL = aplicativo.JogoDasLetras(1, "C");
		Assert.assertTrue("C", questaoJL.respostaCerta());
	}

	@Test
	public void LetraErradaJogoDasLetras() {
		QuestaoJL questaoJL = new QuestaoJL();
		questaoJL = aplicativo.JogoDasLetras(1, "A");
		Assert.assertFalse("C", questaoJL.respostaCerta());
	}

	@Test
	public void DuasLetrasCertasJogoDasLetras() {
		QuestaoJL questaoJL = new QuestaoJL();
		questaoJL = aplicativo.JogoDasLetras(1, "C");
		Assert.assertTrue("C", questaoJL.respostaCerta());
		questaoJL = aplicativo.JogoDasLetras(2, "A");
		Assert.assertTrue("A", questaoJL.respostaCerta());
	}

	@Test
	public void umaLetraCertasEUmaErradaJogoDasLetras() {
		QuestaoJL questaoJL = new QuestaoJL();
		questaoJL = aplicativo.JogoDasLetras(1, "C");
		Assert.assertTrue("C", questaoJL.respostaCerta());
		questaoJL = aplicativo.JogoDasLetras(2, "C");
		Assert.assertFalse("A", questaoJL.respostaCerta());
	}

}
