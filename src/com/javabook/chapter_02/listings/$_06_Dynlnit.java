package com.javabook.chapter_02.listings;

public class $_06_Dynlnit {

    // Демонстрация динамической инициализации
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // Динамически инициализировать volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Объем составляет " + volume);
    }
}
