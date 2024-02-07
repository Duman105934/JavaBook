package com.javabook.chapter_02.tasks;

    /*
        Упражнение 2.1.
        Расчет расстояния до места вспышки молнии,
        звук которого был услышан через 7.2 секунды.
    */

// моя версия
public class $_01_Sound {

    public static void main(String[] args) {
    int speed;
    double distance, time;

    speed = 335;
    time = 7.2;
    distance = (speed * time) / 1000;
        System.out.println("Расстояние до места вспышки равно: " + distance + " км");
    }
}
