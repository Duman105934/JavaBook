package com.javabook.chapter_02.home_work;

public class $_05_Prime_Numbers {

    // Решение из книги
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;
            // Выяснить, делится ли число без остатка
            for (j = 2; j <= i / j; j++)
            // Если делится, тогда оно не является простым
                if ((i % j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");
        }
    }
}
