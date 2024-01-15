package it.epicode.week2.day1.es1;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class UseArr {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(UseArr.class);
    public static void main(String[] args) {

        RandomArray myArr = new RandomArray();
        int[] arr1 = myArr.getMyArr();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num;
        do {
            System.out.println("inserisci un numero da inserire nell'array, per farmare il ciclo inserisci 0");
            num = scanner.nextInt();
            try {
                int position = random.nextInt(4) + 0;
                insertNum(arr1,position,num);
                printArr(arr1);
            }catch (Exception e) {
                logger.error("Errore durante l'inserimento del numero", e);
            }

        } while (num != 0);
        scanner.close();
    }

    static void insertNum (int[] arr, int position, int num) throws Exception{
        if (num >= 1 && num <= 10){
            arr[position] = num;
        }else {
            throw new Exception("This number isn't between 10 to 1");
        }
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}