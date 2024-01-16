package it.epicode.week2.day2.es2ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Es2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        inserNum(3, list);


        System.out.println(list);
        ArrayList<Integer> reverseArray = new ArrayList<>();
        reverseArray = reverse(list);
        System.out.println(reverseArray);
        printForIndex(false, reverseArray);

    }

    public static void inserNum(int n, ArrayList<Integer> list) {

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100) + 1);
        }
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reverseArray = new ArrayList<>();
        reverseArray.addAll(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseArray.add(list.get(i));
        }
        return reverseArray;
    }

    public static void printForIndex(boolean bool, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (bool) {
                if (i  % 2 == 0) {
                    System.out.println(list.get(i));
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
