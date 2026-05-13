package br.patinhasfelizes.animal;

public class Gato extends Animal{

    private int tamanhoPelos;

    public Gato(String nome, double peso, int tamanhoPelos) {
        super(nome, peso);
        this.tamanhoPelos = tamanhoPelos;
    }

    public double calcularPesoBase(){
        if (tamanhoPelos == 1){
            return 45;
        }
        else {
            return 65;
        }
    }
}
