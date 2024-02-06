package com.javabook.chapter_02.listings;

    /*
        Вычисляет количество кубических дюймов в кубической миле.
    */

public class $_01_listing_Inches {

    public static void main(String[] args){
        long ci;
        long im;
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println();
        System.out.println("В кубической миле содержится " + ci + " кубических дюймов.");
    }
}
