package com.javabook.chapter_01.listings;

    /*
        Демонстрация использования оператора if.
        Назовите этот файл IfDemo.java.
    */

public class $_04_listing_If {

    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a is less than b");

        // Следующий оператор ничего не отобразит.
        if (a == b) System.out.println("you won't see this");

        System.out.println();

        c = a - b; // Переменная с содержит -1

        System.out.println("c contains -1");
        if (c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");

        System.out.println();

        c = b - a; // Теперь переменная с содержит 1
        System.out.println("c contains 1");
        if (c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");

    }
}

