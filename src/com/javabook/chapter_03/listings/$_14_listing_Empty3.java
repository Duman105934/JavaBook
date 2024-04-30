package com.javabook.chapter_03.listings;

public class $_14_listing_Empty3 {

    // Тело цикла может быть пустым,
    public static void main(String[] args) {
    int i;
    int sum = 0;

    // Просуммировать числа от 1 до 5.
    for (i = 1; i <= 5; sum += i++);
    System.out.println("Сумма равна " + sum);
    }
}
