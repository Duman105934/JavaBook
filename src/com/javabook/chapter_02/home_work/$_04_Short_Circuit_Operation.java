package com.javabook.chapter_02.home_work;

public class $_04_Short_Circuit_Operation {
    public static void main(String[] args) {
        int a = 5, b = 0;

        if ((b != 0) && (a % b) == 0) {
            System.out.println("Текст не покажется, так как короткозамкнутая операция слева " +
                    "показала false и операция деления на ноль не выполнена");
        } else {
            System.out.println("Текст покажется, так как не сработал if.");
        }
    }
}
