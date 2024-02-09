package com.javabook.chapter_02.listings;

public class $_12_SCops {

    // Демонстрация работы короткозамкнутой операции
    public static void main(String[] args) {
        int n, d;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0)
            System.out.println(d + " - множитель " + n);

        d = 0; // установить d в ноль
        // Поскольку d равно нулю, второй операнд не вычисляется
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " - множитель " + n);
        /*
            Теперь попробовать то же самое, не используя короткозамкнутую
            операцию. В итоге возникнет ошибка деления на ноль.
        */
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " - множитель " + n);
    }
}
