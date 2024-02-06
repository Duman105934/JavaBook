package com.javabook.chapter_01.tasks;

    /*
        Упражнение 1.2.
        Эта программа отображает таблицу преобразований галлонов в литры .
        Назовите этот файл GalToLitTable.java.
    */

class $_02_GalToLitTable {

    public static void main(String[] args){
        double gallons, litters;
        int counter;

        counter = 0; // Установить счетчик строк сначала в ноль

        for (gallons = 1; gallons <= 100; gallons++){
            litters = gallons * 3.7854; // преобразование в литры
            System.out.println(gallons + " галлонов соответствует " + litters + " литрам.");

            counter++; // Увеличивать счетчик строк на каждой итерации

            // После каждой 10-й строки вывести пустую строку
            if (counter == 10) { // Если значение счетчика строк равно 10, вывести пустую строку
                System.out.println();
                counter = 0; //сброс счетчика строк
            }
        }
    }
}
