package com.company.questoes;

public class DesafioTres {

    private static int count[][] = new int[128][110];

    private static void resetCount() {
        for (int i = 0; i < count.length; i++) for (int j = 0; j < count[i].length; j++) count[i][j] = 0;
    }

    /** Esse metodo verifica se é um anagrama
     *
     * @param from1
     * @param to1
     * @param from2
     * @param to2
     * @return
     */
    private static boolean areAnagrams(int from1, int to1, int from2, int to2) {
        for (int i = 'a'; i <= 'z'; i++) {
            if (count[i][to1+1]-count[i][from1] != count[i][to2+1]-count[i][from2])
                return false;
        }
        return true;
    }

    /** esse metodo faz a contagem dos anagramas e dos pares
     *
     * @param str
     */

    public void anagramas (String str){
         int TC = str.length();

        for (int tc = 0; tc < TC; tc++) {
            final char s[] = str.toCharArray();
            resetCount();
            count[s[0]][1] = 1;
            for (int i = 1; i < s.length; i++) {
                for (int j = 'a'; j <= 'z'; j++) count[j][i+1] = count[j][i];
                count[s[i]][i+1]++;
            }
            int res = 0;
            for (int len = 1; len <= s.length-1; len++) {
                for (int from = 0; from <= s.length-len; from++) {
                    for (int to = from+1; to <= s.length-len; to++) {
                        if (areAnagrams(from, from+len-1, to, to+len-1)) res++;
                    }
                }
            }
            if(res == 0) break;
                System.out.println("o número de pares de substrings que são anagramas:  " + res);
                if(res != 0) break;
            }
        }

    }


