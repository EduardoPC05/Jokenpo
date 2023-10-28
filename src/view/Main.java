package view;


import java.util.Scanner;

import model.Jogo;

public class Main {
    public static void main(String[] args) {
        Jogo novo = new Jogo();

        novo.jogar();
        
    }

    public static int modo_jogo(){
        int resposta = -1;
        System.out.println("\nESCOLHA DENTRE OS MODOS DE JOGO:\n");
        System.out.println("1 - Máquina X Humano");
        System.out.println("2 - Máquina X Máquina\n");

        Scanner receber = new Scanner(System.in);

        if(receber.hasNext()) {
            do {
                resposta = receber.nextInt();
            } while (resposta < 1 || resposta > 3);
        }
        return resposta;
    }

    public static int ler_tipo_jogo(){
        int resposta =  -1;
        System.out.println("\nESCOLHA DENTRE OS TIPOS DE JOGO:\n");
        System.out.println("1 - Simples");
        System.out.println("2 - Melhor de três\n");

        Scanner receber = new Scanner(System.in);

        if(receber.hasNext()) {
            do {
                resposta = receber.nextInt();
            } while (resposta < 1 || resposta > 3);
        }
        return resposta;
    }

    public static String ler_nome(){
        System.out.println("\nDIGITE SEU NOME\n");
        Scanner nome = new Scanner(System.in);

        String name = nome.nextLine();

        return name;
    }

    public static int ler_jogada(){
        int resposta;
        System.out.println("\nESCOLHA SUA JOGADA\n");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura\n");

        Scanner jogada = new Scanner(System.in);

        
        do {
            resposta = jogada.nextInt();
        } while (resposta < 0 || resposta > 2);

        
        return  resposta;
    }

}
