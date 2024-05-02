package com.javabook.chapter_03.listings;

public class $_18_listing_DWDemo {

    // Демонстрация использования цикла do-while
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        do {
            System.out.print("Нажмите клавишу и затем ENTER: ");
            ch = (char) System.in.read(); // получить символ
        } while (ch != 'q');
    }
}
