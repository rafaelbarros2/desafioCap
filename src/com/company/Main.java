package com.company;

import com.company.questoes.DesafioTres;
import com.company.questoes.DesafiosUmDois;
import com.company.questoes.validations.Validations;

import java.util.Scanner;

public class Main {

    /** Inicia as questão em um loop podendo escolher de 1 a 3 ou 0 se quiser sair do loop
    * Quando você termina os passos de uma questão ele volta para o loop e pergunta outra vez se quer
     * ir em uma questão ou sair
*/
    public static void main(String[] args) {
        DesafiosUmDois desafios = new DesafiosUmDois();
        Validations validations = new Validations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma Questão de 1 a 3 ou 0 para sair");
            int inteiro = sc.nextInt();
            if (inteiro == 0) {
                System.out.println("Obrigado pela atenção");
                break;
            }
            if (inteiro == 1) {
                System.out.println("Você escolheu a questão numero 1");
                System.out.println("Digite o valor da escada");
                String valorDesafioOne = sc.nextLine();
                int numeroConvertido = Integer.parseInt(valorDesafioOne);
                desafios.desafioOne(numeroConvertido);
            }
            if (inteiro == 2) {

                for (String str : validations.modelSenha()) {
                    System.out.println(str);
                }
                String str = sc.nextLine();
                desafios.desafioTwo(str);

            }

            if (inteiro == 3) {
                DesafioTres desafioTres = new DesafioTres();
                System.out.println("Digite a palavra para ser analisada");
                while (true) {
                    String str = sc.nextLine();
                    String palavra = Validations.retiraEspaco(validations.questionthreeValidation(str));
                    if (validations.repetido(palavra) == true) {
                        desafioTres.anagramas(palavra);
                        break;
                    } else {
                        System.out.println("Essa String não tem nenhum anagrama pois não tem caracteres repetidos");
                        System.out.println("por favor digite outra String");
                        desafioTres.anagramas(palavra);
                    }
                }

            }
        }
        sc.close();
    }

}
