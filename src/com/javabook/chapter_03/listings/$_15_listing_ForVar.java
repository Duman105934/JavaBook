package com.javabook.chapter_03.listings;

public class $_15_listing_ForVar {

    // Объявление переменной управления циклом внутри оператора for
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;
        // Вычислить факториал чисел от 1 до 5.
        for (int i = 1; i <= 5; i++){
            // переменная i известна во всем цикл
            sum += i;
            fact *= i;
        }
        System.out.println("Сумма равна " + sum);
        System.out.println("Факториал равен " + fact);
    }
}