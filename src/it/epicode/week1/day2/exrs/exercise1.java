package it.epicode.week1.day2.exrs;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {

        //exr 1
        String str1 = "Hello";
        boolean control = pariDispari(str1);
        System.out.println("is pare: "+control);
        //exr 2
        int year = 4004;
        boolean control2 = isBisestile(year);
        System.out.println("is bisestile: " + control2);

    }

    public static boolean pariDispari(String str){
        boolean pari = true;
        if (str.length() % 2 != 0){
            pari = false;
        }
        return pari;
    }
    public static boolean isBisestile(int year){
        boolean isBisestile = true;
        if (year % 4 != 0){
            isBisestile = false;
            if (year % 100 != 0 && year % 400 != 0){
                isBisestile = false;
            }
        }
        return isBisestile;
    }
}
