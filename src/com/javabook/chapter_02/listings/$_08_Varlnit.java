package com.javabook.chapter_02.listings;

public class $_08_Varlnit {

    // Демонстрация времени жизни переменной
    public static void main(String[] args) {
        int x;

        for( x = 0; x < 3; x++ ) {
            int y = -1; // у инициализируется при каждом входе в блок
            System.out.println("Значение у равно: " + y); // всегда выводится -1
            y = 100;
            System.out.println("Теперь значение у равно: " + y);
        }
    }
}
