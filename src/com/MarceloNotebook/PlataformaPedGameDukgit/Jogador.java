package com.MarceloNotebook.PlataformaPedGameDukgit;

import javax.swing.JOptionPane;

public class Jogador {
	String nome = "";
    int pontuacao = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;

    }

    public String getNome() {
        return this.nome;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

}

