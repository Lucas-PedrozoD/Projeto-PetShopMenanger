package br.patinhasfelizes.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    public void menu() {
        int opcao = 1;
        String aux;

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

        }while (opcao != 5);

    }
}
