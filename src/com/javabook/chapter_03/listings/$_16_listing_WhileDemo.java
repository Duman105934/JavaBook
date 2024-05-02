package com.javabook.chapter_03.listings;

public class $_16_listing_WhileDemo {

    // Демонстрация применения цикла while
    public static void main(String[] args) {
        char ch;
        // Вывести буквы английского алфавита, используя цикл while
        ch = 'a';
        while (ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }
}
