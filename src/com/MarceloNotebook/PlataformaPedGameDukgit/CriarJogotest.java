package com.MarceloNotebook.PlataformaPedGameDukgit;

import org.junit.Assert;
import org.junit.Test;


public class CriarJogotest {
	@Test 
	public void criarJogo(){
		Jogos jogo = new Jogos();
		// verificar se o jogo n�o acabou 
		Assert.assertFalse("O Jogo n�o Acabou ", jogo.acabou);
		
	}
	public void selecionarJogo(){
		EscolherJogos ej=new EscolherJogos();
		Assert.assertTrue("Jogo Selecionado", ej.selecionaJogo(1));
	}
	

}
