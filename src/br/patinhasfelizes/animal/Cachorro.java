package br.patinhasfelizes.animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    public double calcularPesoBase(){

        if (peso<= 10){
            return 40;
        }
        else if (peso <= 25){

            return 60;
        }
        else {
            return 85;
        }
    }
}
