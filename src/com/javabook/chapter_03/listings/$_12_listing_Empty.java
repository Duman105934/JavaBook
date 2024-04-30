package com.javabook.chapter_03.listings;

public class $_12_listing_Empty {

    // Части цикла for могут быть пустыми.
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 10; ){
            System.out.println("Проход #" + i);
            i++;
        }
    }
}
