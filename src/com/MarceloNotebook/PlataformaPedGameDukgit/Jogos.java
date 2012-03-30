package com.MarceloNotebook.PlataformaPedGameDukgit;

import javax.swing.JOptionPane;

public class Jogos {
	String c;
	int cod;

	public void escolheJogo() {
		this.c = JOptionPane.showInputDialog("GameDuque \n"
				+ "1- APRENDA COMPRANDO \n" + "2- JOGO DAS LETRAS\n");
		this.cod = Integer.parseInt(c);
		// TODO Auto-generated method stub

	}
}
