package it.epicode.week2.day2.es1hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        HashSet<String> words = new HashSet<>();
        ArrayList<String> duplicate = new ArrayList<>();

        fillUpHash(words, duplicate);
        System.out.println("Parole duplicate: " + duplicate);
        System.out.println("Numero parole nell HashSet: " + words.size());
        System.out.println("Parole nell HashSet: " + words);
    }

    public static void fillUpHash(HashSet<String> list, ArrayList<String> duplicate) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di parole che vuoi nella lista.");
        int numWords = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numWords; i++) {
            System.out.println("Inserisci una parola.");
            String word = scanner.nextLine();

            if (list.add(word)) {
                list.add(word);
            }else {
                duplicate.add(word);
            }
        }
    }
}
