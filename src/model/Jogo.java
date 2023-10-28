package model;

import view.Main;

public class Jogo {

    // public void jogar(){
    //     Main.modo_jogo()
    // }

    

    private void Rodada(Jogador primeiro, Jogador segundo){
        int ganhador = primeiro.getEscolha().ganhou(segundo.getEscolha());

        switch (ganhador) {
            case 0:
                System.out.println("Empate");
                break;
            case 1:
                primeiro.attPontos();
                System.out.println("VENCEDOR:"+primeiro.getNome());
                break;
            case -1:
                segundo.attPontos();
                System.out.println("VENCEDOR:"+segundo.getNome());
                break;
        }
    }
}

    



