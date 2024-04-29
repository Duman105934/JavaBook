package com.javabook.chapter_03.listings;

public class $_02_listing_Guess {

    // Игра в угадывание буквы
    public static void main(String[] args)
        throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква между А и Z.");
        System.out.println("Попробуйте ее угадать: ");

        // чтение символа с клавиатуры
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("** Правильно **");
    }
}