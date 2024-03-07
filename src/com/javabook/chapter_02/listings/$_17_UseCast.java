package com.javabook.chapter_02.listings;

public class $_17_UseCast {

    // Использование приведения
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / с дробной частью: " + (double) i / 3);
            System.out.println();
        }
    }
}
