package br.patinhasfelizes.servico;

import br.patinhasfelizes.animal.Animal;


public class Banho extends Servico  {

    public Banho(String descricao, int duracaoMin) {
        super(descricao, duracaoMin);
    }

    public double calcularCusto(Animal animal) {
        return animal.calcularPesoBase() + (duracaoMin * 0.50);
    }



}
