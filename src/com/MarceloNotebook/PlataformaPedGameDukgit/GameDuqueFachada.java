package com.MarceloNotebook.PlataformaPedGameDukgit;

public class GameDuqueFachada {
	Jogador j = new Jogador();

    private EscolherJogos ecj;
    private AprendaComprando apc;
    private JogoDasLetras jl;
    

    public void iniciarAplicativos() {
        this.ecj = new EscolherJogos();
        this.apc = new AprendaComprando();
        this.jl  = new JogoDasLetras();
        
    }

    public void criarJogador(String nome) {
        this.j.setNome(nome);

    }

    public void selecionarJogo(int cod) {
        this.ecj.selecionaJogo(cod);
    }
    
    public void jogoEscolhido() {
        this.ecj.jogoescolhido();
        
    }

    public void aprendaComprando() {
        this.apc.aprendaComprando(this.ecj.jogoescolhido(), this.j.getNome(), this.j.getPontuacao());

    }

    public void jogoDasLetras() {
        this.jl.jogoDasLetras(this.ecj.jogoescolhido(), this.j.getNome(), this.j.getPontuacao());

    }



}
