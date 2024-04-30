package com.javabook.chapter_03.listings;

public class $_13_listing_Empty2 {

    // Вынесение за пределы определения цикла еще одной части
    public static void main(String[] args) {
        int i;
        i = 0; // вынести инициализацию за пределы цикла
        for (; i < 10; ){
            System.out.println("Проход #" + i);
            i++; // инкрементировать переменную управления циклом
        }
    }
}
