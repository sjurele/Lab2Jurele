package com.example.lab2jurele;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test(expected = NullPointerException.class)
    public void WordsCountWhenNull(){
        Calculator.getNumbersCount(null); }

    @Test
    public void TextCountWords(){
        final String givenString = "Zalia balta";
        final int expectedResult = 2;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountNumbers(){
        final String givenString = "Zalia balta";
        final int expectedResult = 0;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountChars(){
        final String givenString = "Zalia balta";
        final int expectedResult = 11;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountEmptyWords(){
        final String givenString = "           ";
        final int expectedResult = 0;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountEmptyChars(){
        final String givenString = "              ";
        final int expectedResult = 14;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountSymbolsNumbers(){
        final String givenString = "%$$@%#$^%#$%";
        final int expectedResult = 0;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountSymbolsChars(){
        final String givenString = "%$$@%#$^%#$%";
        final int expectedResult = 12;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountNumbersCheck(){
        final String givenString = "1234****56789";
        final int expectedResult = 9;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountCharsCheck(){
        final String givenString = "1234****56789";
        final int expectedResult = 13;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountCharsMix(){
        final String givenString = "* 4 * / / 0 0 ____ 999 999 ___++ )___";
        final int expectedResult = 37;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TextCountNumbersMix(){
        final String givenString = "* 4 * / / 0 0 ____ 999 999 ___++ )___";
        final int expectedResult = 9;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void WordsCountNone(){
        final String givenString = "";
        final int expectedResult = 0;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

}