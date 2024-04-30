package com.javabook.chapter_03.listings;

public class $_10_listing_Comma {

    // Использование запятых в операторе for.
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--)
            System.out.println("i и j: " + i + " " + j);
    }
}
