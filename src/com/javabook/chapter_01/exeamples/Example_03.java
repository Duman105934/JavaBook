package com.javabook.chapter_01.exeamples;

public class Example_03 {
    /*
       Программа иллюстрирует отличия между int и double.
       Назовите этот файл Ехашр1еЗ.java.
    */
    public static void main(String[] args) {
        int v;      // объявление целочисленной переменной
        double x;   // объявление переменной с плавающей точкой
        v = 10;     // присваивание переменной v значения 10
        x = 10.0;   // присваивание переменной х значения 10.0

        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);

        System.out.println(); // вывод пустой строки

        // Поделить обе переменные на 4.
        v = v / 4;
        x = x / 4;

        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);
    }
}