package com.javabook.chapter_02.listings;

public class $_16_Prom {

    // Неожиданное повышение типов!
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // Нормально, в приведении нет нужды .
        System.out.println("i and b: " + i + " " + b);

        b = 10;
        b = (byte) (b * b); // Требуется приведение!
        System.out.println("i and b: " + i + " " + b);
    }
}
