package com.javabook.chapter_01.listings;

    /*
        Демонстрация использования блока кода.
        Назовите этот файл BlockDemo.java.
    */

public class $_06_listing_Block {

    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        // Целью оператора if является блок,
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
