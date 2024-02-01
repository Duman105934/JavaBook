package com.javabook.chapter_01;

public class Example_02 {

/*
    This demonstrates a variable. / Демонстрация использования переменных
    Call this file Example2.java. / Назовите этот файл Example2.java.
*/

    public static void main(String[] args) {
        int myVar1; // this declares a variable / объявление переменной
        int myVar2; // this declares another variable / объявление еще одной переменной

        myVar1 = 1024; // this assigns 1024 to myVar1 / присваивание переменной myVarl значения 1024

        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;

        System.out.print("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);
    }

}
