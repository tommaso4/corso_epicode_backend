package it.epicode.week1.day2.exrs;

import java.util.Arrays;
import java.util.Scanner;

public class exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //countDown(scanner);
        es1();
        es2();
        es3();
        es4();
        es5();
        es6(scanner);
        ar1();
        ar2();
        ar3();
        ar4();
        ar5();
        ar6();
        ar7();
        ar8();

    }

    /*public static void countDown(Scanner scanner) {
        System.out.println("Enter a number greater than 0.");
        int num = scanner.nextInt();
        if (num > 0) {
            for (int i = num; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("You entered a number lesser than 1");
        }
    }*/

    public static void es1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void es2() {
        int somma = 0;
        for (int i = 1; i <= 100; i++) {
            somma += i;
        }
        System.out.println("the sum is: " + somma);
    }

    public static void es3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("The even number is:" + i);
            }
        }
    }

    public static void es4() {
        int prodotto = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                prodotto = prodotto * i;
            }
        }
        System.out.println("il prodotto è: " + prodotto);
    }

    public static void es5() {
        for (int i = 5; i <= 50; i += 5) {
            System.out.println("tab del 5: " + i);
        }
    }

    public static void es6(Scanner scanner) {
        System.out.println("enter a word");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char chrt = str.charAt(i);
            System.out.println("char: " + chrt);
        }
    }

    //es array
    public static void ar1() {
        int[] arr = {1, 5, 22, 2, 66, 24};
        int bigger = 0;
        for (int num : arr) {
            if (num > bigger) {
                bigger = num;
            }
        }
        System.out.println(bigger);
    }

    public static void ar2() {
        int[] arr = {1, 5, 22, 2, 66, 24};
        int bigger = 77;
        for (int num : arr) {
            if (num < bigger) {
                bigger = num;
            }
        }
        System.out.println(bigger);
    }

    public static void ar3() {
        int[] arr = {140, 5, 21, 2, 66};
        double media = 0;
        int somma = 0;
        for (int num : arr) {
            somma += num;
        }
        media = (double) somma / arr.length;

        System.out.println("la media è: " + media);
    }

    public static void ar4() {
        String[] parole = {"casa", "cane", "gatto", "casa", "casa"};
        String parola = "casa";
        int count = 0;
        for (String word : parole) {
            if (word == parola) {
                count++;
            }
        }
        System.out.println("omononimi: " + count);
    }

    public static void ar5() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void ar6() {
        int[] arr = {140, 5, 21, 2, 66};
        int el = 5;
        for (int num : arr) {
            if (num == el) {
                System.out.println("Arrays include this elemnt:" + el);
            }
        }

    }

    public static void ar7() {
        int[] arr = {140, 5, 21, 2, 66};
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            arr[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void ar8() {
        String[] parole = {"casa", "cane", "gatto", "auto", "albero"};
        String wordToFind = "cane";
        int indexWord = -1;

        for (int i = 0; i < parole.length; i++) {
            if (wordToFind.equals(parole[i])) {
                indexWord = i;
            }
        }
        System.out.println("the word have index: " + indexWord);
    }
}
