package com.javabook.chapter_02.listings;

public class $_13_SideEffects {

        // Побочные эффекты могут быть важны
        public static void main(String[] args) {
        int i;
        i = 0;

        /*
            Здесь i все равно инкрементируется, несмотря на то,
            что условие в операторе if дает false.
        */
        if (false & (++i < 100))
            System.out.println("He отображается");
        // i имеет значение 1
        System.out.println("Оператор if выполняется: " + i);

        /*
            В данном случае i не инкрементируется, поскольку
            короткозамкнутая операция пропускает инкрементирование.
        */
        if (false && (++i < 100))
            System.out.println("He отображается");
        // i по-прежнему имеет значение 1!
        System.out.println("Оператор if выполняется: " + i);

    }
}
