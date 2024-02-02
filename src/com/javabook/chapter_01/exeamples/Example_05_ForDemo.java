package com.javabook.chapter_01.exeamples;

public class Example_05_ForDemo {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 5; count++) { // простой способ увеличить count = count + 1
            System.out.println("Значение count: " + count);
        }
        System.out.println("Готово!");
    }
}
