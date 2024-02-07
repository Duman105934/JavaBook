package com.javabook.chapter_02.listings;

public class $_03_CharArith {

    // С символьными переменными можно обращаться как с целочисленными
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("ch содержит " + ch);
        ch++; // инкрементирование ch
        System.out.println("ch теперь содержит " + ch);
        ch = 90; // присваивание ch значения Z
        System.out.println("ch теперь содержит " + ch);
    }
}
