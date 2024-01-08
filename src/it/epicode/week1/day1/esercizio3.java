package it.epicode.week1.day1;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //area rettangolo

        System.out.println("Inserisci due numeri per i lati di un rettangolo");
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int perimetro = perimetroRettangolo(sideA, sideB);
        System.out.println("Perimetro = " + perimetro);

        //pari o dispari

        System.out.println("Inserisci un numero");
        int num1 = scanner.nextInt();
        int res = pariODispari(num1);
        System.out.println(res);

        // area triangolo

        System.out.println("Inserisci tre numeri per i lati di un triangolo");
        int sideC = scanner.nextInt();
        int sideD = scanner.nextInt();
        int sideE = scanner.nextInt();

        double areaTriangolo = areaTriangolo(sideC,sideD,sideE);

        System.out.println("Area = " + areaTriangolo);

    }

    public static int perimetroRettangolo (int a , int b){
        return ((a*2)+ (b*2));
    }
    public static int pariODispari(int num){
        int res = 0;
        if (num % 2 != 0){
            res = 1;
        }
        return res;

    }

    public static double areaTriangolo (int a, int b, int c){
        int s = (a+b+c)/2;
        int notArea = s * (s - a) * (s - b)* (s - c);
        return Math.sqrt(notArea);
    }

}
