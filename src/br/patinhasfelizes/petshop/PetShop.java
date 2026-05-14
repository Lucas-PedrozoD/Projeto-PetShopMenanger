package br.patinhasfelizes.petshop;

import br.patinhasfelizes.animal.Animal;
import br.patinhasfelizes.atendimento.Atendimento;
import br.patinhasfelizes.interfaces.Calculavel;
import br.patinhasfelizes.interfaces.Relatorio;
import br.patinhasfelizes.servico.Servico;
import java.util.ArrayList;


public class PetShop implements Relatorio, Calculavel {
    ArrayList<Animal> listaAnimal = new ArrayList<>();
    ArrayList<Servico> listaServico = new ArrayList<>();
    ArrayList<Atendimento> listaAtendimento = new ArrayList<>();





    public String gerarResumo(){
        String aux = "";
        aux += "Nome: "+ listaAnimal.getFirst().getNome() + "\n";
        aux += "Peso: "+ listaAnimal.getFirst().getPeso() + "\n";
        return aux;
    }
    public double calcularTotal(){
        return 0;
    }


}
