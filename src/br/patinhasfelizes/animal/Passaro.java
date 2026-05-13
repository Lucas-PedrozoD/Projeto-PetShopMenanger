package br.patinhasfelizes.animal;

public class Passaro extends Animal{

    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    public double calcularPesoBase(){
        return 30;
    }
}
