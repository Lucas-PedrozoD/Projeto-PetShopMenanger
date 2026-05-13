package br.patinhasfelizes.servico;

import br.patinhasfelizes.animal.Animal;

public class Consulta extends Servico {

    final Double taxaDeConsulta = 35.00;

    public Consulta(String descricao, int duracaoMin) {
        super(descricao, duracaoMin);
    }

    public double calcularCusto(Animal animal) {
        return animal.calcularPesoBase() + taxaDeConsulta;
    }
}
