package com.MarceloNotebook.PlataformaPedGameDukgit;

public class QuestaoAPC {
	String pergunta1 = "2+2";
	int resposta1 = 4;
	boolean certo;
	public String Pergunta(){
		return pergunta1;
	}
	public void setResposta(int resposta){
		if(this.resposta1 == resposta){
			this.certo = true;
		}else{
		this.certo = false;
		}
	}
	public boolean resposta(){
		return certo;
	}

}
