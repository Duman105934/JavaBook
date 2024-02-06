package com.javabook.chapter_01.listings;

    /*
        Демонстрация использования переменных
        Назовите этот файл Example2.java.
    */

public class $_02_listing {

    public static void main(String[] args) {
        int myVar1; // объявление переменной
        int myVar2; // объявление еще одной переменной

        myVar1 = 1024; // присваивание переменной myVarl значения 1024

        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;

        System.out.print("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);
    }

}
