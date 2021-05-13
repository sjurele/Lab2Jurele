package com.example.lab2jurele;

public class Calculator {
    public static int getCharsCount(String inputText){
        return inputText.length();
    }

    public static int getNumbersCount(String userInputText) {
        int count=0;
        for(char c: userInputText.toCharArray()){
            if (Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }

    public static int getWordsCount(String userInputText){
        if (userInputText.trim().isEmpty())
            return 0;
        else return userInputText.trim().split("\\s+").length;
    }
}