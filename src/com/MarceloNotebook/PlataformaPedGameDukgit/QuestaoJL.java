package com.MarceloNotebook.PlataformaPedGameDukgit;

public class QuestaoJL {
	
	String[] palavra1 = new String[]{"C", "A","S","A"};
	String[] palavras = new String[]{"CASA","",""};
	String[] letras = new String[]{"C", "A","S","A"};
	boolean certo;
	
	
	public String getpalavra(){
		return palavras[0];
	}
	public void setResposta(int posicao, String letra){
		posicao--;
		if(this.palavra1[posicao] == letra){
			this.certo = true;
		}else{
			this.certo = false;
		}
		
	}
	public boolean respostaCerta(){
		return this.certo;
	}

}
