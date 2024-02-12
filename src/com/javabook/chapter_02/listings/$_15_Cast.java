package com.javabook.chapter_02.listings;

public class $_15_Cast {

    // Демонстрация приведений
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // приведение double к int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for X
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
