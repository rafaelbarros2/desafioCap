package com.company.questoes.validations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validations {

    /**
     *  Esse método valida se uma string tem pelo menos um char especial
    */

    public static boolean charSpecial(String str) {
        int size = str.length();
        String strings = "!@#$%^&*()-+";
        int k = strings.length();
        for (int j = 0; j < k; ++j) {
            for (int i = 0; i < size; ++i) {
                char tempChar = str.charAt(i);
                char charsSpecial = strings.charAt(j);
                if (tempChar == charsSpecial) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
    * verifica se a string tem pelo menos um digito
    */

    public static boolean getDigits(String str) {
        int sz = str.length();
        StringBuilder strDigits = new StringBuilder(sz);

        for (int i = 0; i < sz; ++i) {
            char tempChar = str.charAt(i);
            if (Character.isDigit(tempChar)) {
                return true;
            }
        }
        return false;
    }


    /**
     *  Esse metodo imprime a instruções da senha para a questão 2
    */
    public List<String> modelSenha() {
        List<String> mensagensSenhas = new ArrayList<>();
        mensagensSenhas.add("São aceitas apenas senhas fortes com as seguintes caracteristicas");
        mensagensSenhas.add("Possui no mínimo 6 caracteres.");
        mensagensSenhas.add("Contém no mínimo 1 digito.");
        mensagensSenhas.add("Contém no mínimo 1 letra em minúsculo.");
        mensagensSenhas.add("Contém no mínimo 1 letra em maiúsculo.");
        mensagensSenhas.add("Contém no mínimo 1 caractere especial.");
        mensagensSenhas.add("Digite a sua senha");
        return mensagensSenhas;
    }

    /**
     * Este metodo pede ao usuario para entrar com uma palavra
     * E valida se tem o numero minimo de caracteres
     *
     * @return palavra
     */
    public String questionthreeValidation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra para ser analisada");
        String palavra = "";
        while (palavra.length() <= 2) {
            palavra = sc.nextLine();
            if (palavra.length() <= 2) {
                System.out.println("Digite uma palavra de no minimo 3 caracteres");
            }

        }
        return palavra;
    }

    /**
     * Este metodo recebe uma palavra e remove todos os espaços entre, durante e
     * no final de qualquer palavra.
     *
     * @param palavra
     * @return palavra_sem_espaços
     */
    public String retira_Espaco(String palavra) {
        String alterada = "", interna = (palavra).trim();
        char c;

        for (int i = 0; i < interna.length(); i++) {
            c = interna.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                alterada += c;
            }// if
        }// for

        return alterada;
    }

    /**
     * Este metodo verifica se tem caractes repetidos na String
     */

    public boolean repetido(String s) {
        int i = 0, j, cont = 0;
        char c, d;
        boolean repeated = false;
        for (j = 0; j < s.length(); j++) {
            for (i = j + 1; i < s.length(); i++) {
                c = s.charAt(i);
                d = s.charAt(j);
                if (c == d)
                    cont++;
            }
        }
        if (cont != 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /** Verifica se tem pelo menos um char minusculo e um maiusculo na string.
     *
     * @param cs
     * @return
     */
    public static boolean isMixedCase(CharSequence cs) {
        if (!isEmpty(cs) && cs.length() != 1) {
            boolean containsUppercase = false;
            boolean containsLowercase = false;
            int sz = cs.length();

            for(int i = 0; i < sz; ++i) {
                if (containsUppercase && containsLowercase) {
                    return true;
                }

                if (Character.isUpperCase(cs.charAt(i))) {
                    containsUppercase = true;
                } else if (Character.isLowerCase(cs.charAt(i))) {
                    containsLowercase = true;
                }
            }

            return containsUppercase && containsLowercase;
        } else {
            return false;
        }
    }

}
