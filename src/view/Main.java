package view;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(ler_jogada());
    }

    public static int modo_jogo(){

        System.out.println("ESCOLHA DENTRE OS MODOS DE JOGO:");
        System.out.println("01 - Máquina X Humano");
        System.out.println("02 - Máquina X Máquina");
        
        Scanner receber = new Scanner(System.in);


        return receber.nextInt();
    }

    public static String ler_nome(){
        System.out.println("DIGITE SEU NOME");
        Scanner nome = new Scanner(System.in);

        return nome.nextLine();
    }

    public static int ler_jogada(){
        System.out.println("ESCOLHA SUA JOGADA");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");

        Scanner jogada = new Scanner(System.in);

        return jogada.nextInt();
    }
}
