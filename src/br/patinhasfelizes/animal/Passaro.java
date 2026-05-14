package br.patinhasfelizes.animal;

import br.patinhasfelizes.interfaces.Relatorio;

public class Passaro extends Animal {

    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    public double calcularPesoBase(){
        return 30;
    }

}
