package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Печать пробелов
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            // Печать левой стороны пирамиды
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // Печать правой стороны пирамиды
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            // Переход на новую строку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
