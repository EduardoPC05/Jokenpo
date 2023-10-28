package model;

public class Pedra extends Coisa {

    @Override
    public int ganhou(Coisa adversario) {
        int retorno = -2; // valor inicial
        if (adversario instanceof Tesoura) {
            retorno = 1; // Ganhou
        }
        if (adversario instanceof Pedra) {
            retorno = 0;// Empate
        }
        if (adversario instanceof Papel) {
            retorno = -1;// Perdeu
        }
        return retorno;
    }
    @Override
    public String get_jogada(){
        return "Pedra";
    }

}
