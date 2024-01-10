package it.epicode.week1.day2.exrs;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //exr2
        int num1 = 2;
        control(num1);
        //exr3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a words, if you want to stop a lap insert 'q'");
        String str = scanner.nextLine();
        printStr(str, scanner);
    }
    public static void printStr (String str, Scanner scanner){
        while (!str.equals("q")){
            String[] caratteri = str.split("");
            System.out.println(Arrays.toString(caratteri));
            System.out.println("Insert a words, if you want to stop a lap insert 'q'");
            str = scanner.nextLine();
        }
    }
    public static void control(int num) {
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("The number isn't between 0 and 3");
        }
    }
}
