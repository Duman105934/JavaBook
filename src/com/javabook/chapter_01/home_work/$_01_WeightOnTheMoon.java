package com.javabook.chapter_01.home_work;

public class $_01_WeightOnTheMoon {

    public static void main(String[] args){
        double coefficient;
        int weight;
        double my_weight;

        coefficient = 0.17;
        weight = 93;

        if (weight >= 0) {
            my_weight = weight * coefficient;
            System.out.println("Мой вес на луне: " + my_weight );
        }
    }
}
