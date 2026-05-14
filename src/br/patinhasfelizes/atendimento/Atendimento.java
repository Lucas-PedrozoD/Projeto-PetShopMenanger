package br.patinhasfelizes.atendimento;

import br.patinhasfelizes.animal.Animal;
import br.patinhasfelizes.servico.Servico;

public class Atendimento {
    private Animal animal;
    private Servico servico;

    public Atendimento(Animal animal, Servico servico) {
        this.animal = animal;
        this.servico = servico;
    }


}
