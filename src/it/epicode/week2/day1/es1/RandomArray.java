package it.epicode.week2.day1.es1;

import java.util.Random;

public class RandomArray {

    private int[] myArr = new int[5];

    public RandomArray (){
        this.myArr = setMyArr();
    }

    private int[] setMyArr(){

        Random random = new Random();

        for (int i = 0; i < myArr.length; i++){
            myArr[i] = random.nextInt(10) + 1;
        }
        return myArr;
    }

    public int[] getMyArr() {
        return myArr;
    }
}
