package model;

public class Tesoura extends Coisa{

    @Override
    public int ganhou(Coisa adversario) {
        int retorno = -2; // valor inicial
        if (adversario instanceof Tesoura) {
            retorno = 0; // Empate
        }
        if (adversario instanceof Pedra) {
            retorno = -1;// Perdeu
        }
        if (adversario instanceof Papel) {
            retorno = 1;// Ganhou
        }
        return retorno;
    }
    @Override
    public String get_jogada(){
        return "Tesoura";
    }
    
}
