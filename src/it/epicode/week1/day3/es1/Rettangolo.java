package it.epicode.week1.day3.es1;

public class Rettangolo {

    //attributs
    private int height;
    private int length;

    //constructor
    public Rettangolo (int height, int length){
        this.height = height;
        this.length = length;
    }
    public int area(){
        return height * length;
    }
    public int perimeter(){
        return (height + length)*2;
    }

}
