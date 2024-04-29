package com.javabook.chapter_03.listings;

public class $_01_listing_KbIn {

    // Чтение символа с клавиатуры
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        System.out.print("Нажмите клавишу и затем ENTER: ");
        ch = (char) System.in.read(); // получить символ
        System.out.println("Была нажата клавиша: " + ch);
    }
}