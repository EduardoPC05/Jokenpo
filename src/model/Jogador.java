package model;

import java.lang.Math;

public class Jogador {

    private String nome;
    private Coisa escolha;
    private boolean maquina;
    private int pontos;


    public Jogador(String nome, int escolha) {
        this.nome = nome;
        this.escolha = instancia(escolha);
        this.maquina = false;
        this.pontos = 0;
    }
    public Jogador(String nome) {
        this.nome = nome;
        this.escolha = instancia(escolhe_automatico());
        this.maquina = true;
        this.pontos = 0;
    }


    private Coisa instancia(int escolha){
        Coisa teste = null;
        switch (escolha) {
            case 0:
                teste = new Pedra();
                break;
            case 1:
                teste = new Papel();
                break;
            case 2:  
                teste = new Tesoura();
                break;
        }

        return teste;

    }

    private int escolhe_automatico(){
        return (int)(Math.random() * 3);
    }


    public Coisa getEscolha() {
        return escolha;
    }
    public void setEscolha(int escolha) {
       this.escolha = instancia(escolha);
    }
    public void setEscolha(){
        this.escolha = instancia(escolhe_automatico());
    }
    public String getNome() {
        return nome;
    }
    public boolean isMaquina() {
        return maquina;
    }
    public int getPontos() {
        return pontos;
    }
    public void attPontos() {
        this.pontos += 1;
    }   
    
}
