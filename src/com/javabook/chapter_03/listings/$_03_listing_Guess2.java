package com.javabook.chapter_03.listings;

public class $_03_listing_Guess2 {

    // Игра в угадывание буквы, версия 2.
    public static void main(String[] args)
        throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква между А и Z.");
        System.out.println("Попробуйте ее угадать: ");

        // чтение символа с клавиатуры
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("** Правильно **");
        else System.out.println("... Увы, не угадали.");
    }
}