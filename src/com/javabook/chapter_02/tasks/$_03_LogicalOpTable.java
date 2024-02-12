package com.javabook.chapter_02.tasks;

public class $_03_LogicalOpTable {

    public static void main(String[] args) {
        byte p;
        byte q;
        int pi;
        int qi;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        pi = 1;
        qi = 1;

        p = (byte) pi;
        q = (byte) qi;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));

        pi = 1;
        qi = 0;

        p = (byte) pi;
        q = (byte) qi;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));

        pi = 0;
        qi = 1;

        p = (byte) pi;
        q = (byte) qi;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));

        pi = 0;
        qi = 0;

        p = (byte) pi;
        q = (byte) qi;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));
    }
}
