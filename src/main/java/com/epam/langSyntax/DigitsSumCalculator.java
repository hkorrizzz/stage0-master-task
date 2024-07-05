package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int thousands = number / 1000;           // Extracts the thousands place
        int hundreds = (number % 1000) / 100;    // Extracts the hundreds place
        int tens = (number % 100) / 10;          // Extracts the tens place
        int ones = number % 10;                  // Extracts the ones place

        int sum = thousands + hundreds + tens + ones; // Calculates the sum of the digits
        System.out.println(sum);
    }

}
