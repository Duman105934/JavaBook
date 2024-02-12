package com.javabook.chapter_02.tasks;

    /*
        Дополнительная задача.
        Расчет расстояния до скалы по звуку эхо.
    */

// моя версия
public class $_02_Sound_2 {

    public static void main(String[] args) {
    int speed;
    double distance, time;

    speed = 335;
    time = 7.2;
    distance = ((time / 2) * speed) / 1000;
        System.out.println("Расстояние до места скалы равно: " + distance + " км");
    }
}
