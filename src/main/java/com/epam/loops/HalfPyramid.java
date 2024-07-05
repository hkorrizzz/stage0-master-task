package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Печать пробелов
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            // Печать звездочек
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Переход на новую строку
            System.out.println();

        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
