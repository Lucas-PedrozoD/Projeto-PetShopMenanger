package br.patinhasfelizes.util;

import br.patinhasfelizes.animal.Animal;
import br.patinhasfelizes.animal.Gato;
import br.patinhasfelizes.animal.Cachorro;
import br.patinhasfelizes.petshop.PetShop;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    public void menu() {
        int opcao = 1;
        String aux, aux1;
        int cont = 1;
        PetShop petShop = new PetShop();

        aux = """
                1.Cadastrar Animal
                2.Registrar Serviço
                3.Calcular Conta Total
                4.Imprimir Relatório
                5.Finalizar
                """;
        do {
            try {
                opcao= parseInt(showInputDialog(aux));
            }
            catch (NumberFormatException e){
                showMessageDialog(null,"A opção deve ser um"+
                        " numero inteiro\n");
            }
            switch (opcao){
                case (1) -> {
                    try {
                        aux1 = """
                                Animal Cadastrado
                                1.Cachorro
                                2.Gato
                                3.Pássaro
                                """;
                        cont= parseInt(showInputDialog(aux1));
                    }
                    catch (NumberFormatException e){
                        showMessageDialog(null,"A opção deve ser um"+
                                " numero inteiro\n");
                    }
                    switch (cont){
                        case (1) -> {
                            String nome ;
                            double peso;
                            nome = showInputDialog("Nome do Cachorro: ");
                            peso = parseDouble(showInputDialog("Peso do Cachorro: "));
                            petShop.listaAnimal.add(new Cachorro(nome,peso));
                        }
                        case (2) ->{
                            String nome ;
                            double peso;
                            int tamanhoPelo;
                            nome = showInputDialog("Nome do Gato: ");
                            peso = parseDouble(showInputDialog("Peso do Gato: "));
                            tamanhoPelo = parseInt(showInputDialog("""
                                    Tamanho do Pelo do Gato
                                    """));

                            petShop.listaAnimal.add(new Gato());
                        }
                    }
                }
            }

        }while (opcao != 5);

    }
}
