package br.patinhasfelizes.animal;

public abstract class Animal {
   protected String nome;
   protected double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double calcularPesoBase();
}
