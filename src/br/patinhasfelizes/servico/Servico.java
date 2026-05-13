package br.patinhasfelizes.servico;

import br.patinhasfelizes.animal.Animal;

public abstract class Servico {
    protected String descricao;
    protected int duracaoMin;

    public Servico(String descricao, int duracaoMin) {
        this.descricao = descricao;
        this.duracaoMin = duracaoMin;
    }

    public abstract double calcularCusto(Animal animal);
}
