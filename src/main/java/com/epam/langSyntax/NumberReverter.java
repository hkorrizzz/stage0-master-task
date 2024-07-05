package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int hundreds = number / 100;             // Extracts the hundreds place
        int tens = (number % 100) / 10;          // Extracts the tens place
        int ones = number % 10;                  // Extracts the ones place

        int revertedNumber = ones * 100 + tens * 10 + hundreds; // Reverses the number
        System.out.println(revertedNumber);      // Prints the reversed number
    }


}
