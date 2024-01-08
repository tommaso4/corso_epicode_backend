package it.epicode.week1.day1;

import java.util.SplittableRandom;

public class Esercizzi_day1 {
    public static String Concatena(String str1, String str2) {
        return str1 + str2;
    }

    public static String Moltiplica(int num1, int num2) {
        int res = num1 * num2;
        return "Il prodotto è:" + res;
    }

    public static String[] Inserisci(String[] arr, String newStr) {

        if (arr.length != 5) {
            System.out.println("L'array deve avere cinque elementi.");
            return null;
        }

        String[] newArray = new String[6];

        for (int i = 0; i < 2; i++) {
            newArray[i] = arr[i];
        }

        newArray[2] = newStr;

        for (int i = 3; i <=6 ; i++) {
            newArray[i] = arr[i -1];
        }
        return newArray;
    }

    public static void main(String[] args) {

        String prodotto = Moltiplica(2, 4);
        System.out.println(prodotto);

        String concat = Concatena("Hello ", "World!!");
        System.out.println(concat);

        String[] myArr = {"uno","due", "tre", "quattro", "cinque"};
        String[] newArr = Inserisci(myArr, "myStr");
        System.out.println(newArr);

    }
}

