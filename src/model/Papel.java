package model;

public class Papel extends Coisa {

    @Override
    public int ganhou(Coisa adversario) {
        int retorno = -2; // valor inicial
        if (adversario instanceof Tesoura) {
            retorno = -1; // Perdeu
        }
        if (adversario instanceof Pedra) {
            retorno = 1;// Ganha
        }
        if (adversario instanceof Papel) {
            retorno = 0;// Papel
        }
        return retorno;
    }

    @Override
    public String get_jogada(){
        return "Papel";
    }

}
