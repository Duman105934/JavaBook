package com.javabook.chapter_01.exeamples;

public class Example_06_BlockDemo {
    /*
        Демонстрация использования блока кода.
        Назовите этот файл BlockDemo.java.
    */
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
