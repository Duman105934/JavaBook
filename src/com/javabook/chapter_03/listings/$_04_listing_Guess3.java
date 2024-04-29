package com.javabook.chapter_03.listings;

public class $_04_listing_Guess3 {

    // Игра в угадывание буквы, версия 3.
    public static void main(String[] args)
        throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква между А и Z.");
        System.out.println("Попробуйте ее угадать: ");

        // чтение символа с клавиатуры
        ch = (char) System.in.read();
        if (ch == answer) System.out.print("** Правильно **");
        else {
            System.out.print("... Увы, не угадали. Задуманная буква находиться ");
                // Вложенный оператор if.
                if (ch < answer) System.out.print("дальше по алфавиту.");
                else System.out.print("ближе по алфавиту.");
        }
    }
}