package com.company.tests;

import com.company.questoes.DesafioTres;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesafioTresTest {


    @Test
    void anagramas() {
        String str = "ovo";
        String string = "ifailuhkqq";
        DesafioTres desafioTres = new DesafioTres();
        Assertions.assertEquals(2, desafioTres.anagramas(str));
        Assertions.assertEquals(3, desafioTres.anagramas(string));
    }
}