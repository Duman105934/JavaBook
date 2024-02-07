package com.javabook.chapter_01.home_work;

class $_02_InchToMetterTable {

    public static void main(String[] args){
        double inch, metter;
        int counter;

        counter = 0;

        for (inch = 1; inch <= 50; inch++){
            metter = inch * 0.0254;
            System.out.println(inch + " дюймов соответствует " + metter + " метрам.");

            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
