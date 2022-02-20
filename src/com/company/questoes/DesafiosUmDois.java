package com.company.questoes;


import java.util.*;
import com.company.questoes.validations.Validations;

import java.util.stream.Stream;

public class DesafiosUmDois {

    public void  desafioOne(int max){
        String ourString = "*";
        for(int count = 0; count <= max; count++) {
            Optional<String> result1 = Stream.generate(()-> ourString).limit(count).reduce((a, b) -> a + b);
            String finalResult;
            if (result1.isPresent()) {
                finalResult = result1.get();
                System.out.println(finalResult);
            }
        }
    }

    /* Esse método faz a validação nescessaria para a senha ser forte */

    public void desafioTwo(String str){
        Scanner sc = new Scanner(System.in);
        if (Validations.charSpecial(str) == false){
            System.out.println("A senha precisa de um Caracter Especial");
            String  senha = sc.nextLine();
            desafioTwo(senha);
            sc.close();
        }else if (str.length() < 6 ){
            int stringSize = 6 - str.length();
            System.out.println("A senha tem que ter no minimo 6 caracteres");
            System.out.println("Faltam pelo menos mais " + stringSize + " digitos para ser uma senha forte");
            System.out.println("Digite a sua senha");
            String  senha = sc.nextLine();
            desafioTwo(senha);
            sc.close();
        }else if(Validations.isMixedCase(str)==false){
            System.out.println("A senha tem que ter no minimo 1 letra maiuscula e 1 minuscula");
            System.out.println("Digite a sua senha");
            String  senhaCase = sc.nextLine();
            desafioTwo(senhaCase);
            sc.close();
        }else if(Validations.getDigits(str) == false){
            System.out.println("A senha tem que ter no minimo 1 numero");
            System.out.println("Digite a sua senha");
            String senha = sc.nextLine();
            desafioTwo(senha);
            sc.close();
        }
        else{
            System.out.println("senha aceita");
        }
        sc.close();
    }

    public Character[] getAllSubstrings(String string) {
        int i;
        Character[] result = new Character[0];
        Collection<Character> list = new ArrayList<>();
        for (i = 0; i < string.length(); i++) {
            char chars = string.charAt(i);
            list.add(chars);
        }
        result = list.toArray(result);
        return result;
    }

}
