package com.javabook.chapter_03.listings;

public class $_11_listing_ForTest {

    // Цикл до тех пор, пока не будет введена буква S.
    public static void main(String[] args)
            throws java.io.IOException {
        int i;
        System.out.println("Для остановки цикла нажмите S.");
        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Проход #" + i);
        }
    }
}
