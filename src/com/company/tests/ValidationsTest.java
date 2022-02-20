package com.company.tests;

import com.company.questoes.validations.Validations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ValidationsTest {

    @Test
    void whenHaveCharSpecialShouldReturnTrue() {
        String str = "rafael%";
        Assertions.assertTrue( Validations.charSpecial(str));
    }

    @Test
    void WhenDoesCharSpecialShouldReturnFalse() {
        String str = "rafael1";
        Assertions.assertFalse(Validations.charSpecial(str));
    }

    @Test
    void whenHaveDigitsShouldReturnTrue() {
        String str = "rafael1";
        Assertions.assertTrue(Validations.getDigits(str));
    }


    @Test
    void whenQuestionHasMinimumSizeShouldReturnMsg() {
        String msg = "Digite uma palavra de no minimo 3 caracteres";
        String minimum = "asd123";
        String string = Validations.questionthreeValidation(minimum);
        Assertions.assertEquals(string, minimum);
    }

    @Test
    void whenQuestionDoesMinimumSizeShouldReturnErrorMsg() {
        String msg = "Digite uma palavra de no minimo 3 caracteres";
        String minimum = "asd123";
        String string = Validations.questionthreeValidation(minimum);
        Assertions.assertEquals(string, minimum);
    }

    @Test
    void whenStringHaveSpaceRetiraEspacoRemoveTheSpace() {
        String stringComEspaco = "rafa el";
        String stringSemEspaco = "rafael";
        Assertions.assertEquals(Validations.retiraEspaco(stringComEspaco), stringSemEspaco);
    }

    @Test
    void whenStringHaveRepeatedCharReturnTrue() {
        String stringCharRepetido = "casa";
        String stringSemCharRepetido = "rifa";
        Assertions.assertTrue(Validations.repetido(stringCharRepetido));
        Assertions.assertFalse(Validations.repetido(stringSemCharRepetido));
    }

    @Test
    void isEmpty() {
        String isEmpty = "";
        String notIsEmpty = "rafael";
        Assertions.assertTrue(Validations.isEmpty(isEmpty));
        Assertions.assertFalse(Validations.isEmpty(notIsEmpty));
    }

    @Test
    void isMixedCase() {
        String stringCom = "Rafael";
        String stringSem = "rafael";
        Assertions.assertTrue(Validations.isMixedCase(stringCom));
        Assertions.assertFalse(Validations.isMixedCase(stringSem));
    }
}