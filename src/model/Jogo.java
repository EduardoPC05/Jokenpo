package model;

import view.Main;

public class Jogo {

    public void jogar() {

        int modo_game = Main.modo_jogo();
        int tipo_game = Main.ler_tipo_jogo();
        Jogador jogador1 = new Jogador("Maquina");
        Jogador jogador2;

        if (modo_game == 1) {
            jogador2 = new Jogador(Main.ler_nome(), Main.ler_jogada());
        } else {
            jogador2 = new Jogador("Maquina2");
        }

        Rodada(jogador1, jogador2);
        mostra_pontos(jogador1, jogador2);
        if (tipo_game == 2) {
            while (jogador1.getPontos() < 2 && jogador2.getPontos() < 2) {
                if (modo_game == 1) {
                    jogador1.setEscolha(Main.ler_jogada());
                    jogador2.setEscolha();
                } else {
                    jogador1.setEscolha();
                    jogador2.setEscolha();
                }

                Rodada(jogador1, jogador2);
                mostra_pontos(jogador1, jogador2);
            }
        }
        mostra_ganhou(jogador1, jogador2);

    }

    private void mostra_pontos(Jogador j1, Jogador j2) {
        System.out.println("\n"+j1.getNome() + " | " + j1.getPontos()+"\n");
        System.out.println("\n"+j2.getNome() + " | " + j2.getPontos()+"\n");
    }

    private void mostra_ganhou(Jogador j1, Jogador j2) {
        System.out.println("\n\n******NOTA FINAL******\n\n");
        if (j1.getPontos() == j2.getPontos()) {
            System.out.println("\nEMPATE\n");
        } else {
            System.out.println("GANHADOR:");

            if (j1.getPontos() > j2.getPontos()) {
                System.out.println(j1.getNome());
            } else {
                System.out.println(j2.getNome());
            }

        }

    }

    private void Rodada(Jogador primeiro, Jogador segundo) {
        int ganhador = primeiro.getEscolha().ganhou(segundo.getEscolha());

        System.out.println("\n---NOVO GAME---\n");

        System.out.println(primeiro.getNome() + ": " + primeiro.getEscolha().get_jogada() + "\n");
        System.out.println(segundo.getNome() + ": " + segundo.getEscolha().get_jogada() + "\n");

        System.out.println(primeiro.getEscolha().get_jogada() + "  VS  " + segundo.getEscolha().get_jogada() + "\n");

        switch (ganhador) {
            case 0:
                System.out.println("Empate");
                break;
            case 1:
                primeiro.attPontos();
                break;
            case -1:
                segundo.attPontos();
                break;
        }
    }
}
