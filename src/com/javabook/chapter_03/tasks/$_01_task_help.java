package com.javabook.chapter_03.tasks;

public class $_01_task_help {
    /*
        Упражнение 3.1.
        Простая справочная система по управляющим операторам Java.
    */
    public static void main(String[] args)
        throws java.io.IOException {
        char choice;

        System.out.println("Справка по:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.print("Выберите вариант: ");

        choice = (char) System.in.read();
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Традиционный оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("    case константа:");
                System.out.println("    последовательность операторов");
                System.out.println("    break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Выбранный вариант не найден.");
        }
    }
}
