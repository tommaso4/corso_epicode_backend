package it.epicode.week1.day1;

import java.util.Arrays;
import java.util.Scanner;

public class esercizio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci tre stringhe:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String strRight = concat(str1, str2, str3);
        System.out.println(strRight);

        String strReverse = concat(str3, str2, str1);
        System.out.println(strReverse);
    }

    public static String concat (String str1,String str2,String str3){
        return str1 + str2 + str3;
    }

}
