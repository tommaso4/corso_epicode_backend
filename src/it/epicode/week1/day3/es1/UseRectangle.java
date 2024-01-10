package it.epicode.week1.day3.es1;

public class UseRectangle {

    public static void main(String[] args) {

        Rettangolo rectangle1 = new Rettangolo(5,4);
        Rettangolo rectangle2 = new Rettangolo(2,4);

        print1Rect(rectangle1);
        print2Rect(rectangle1, rectangle2);


    }

    public static void print1Rect(Rettangolo rect){

        System.out.println("The area is:" + rect.area());
        System.out.println("The perimeter is:" +rect.perimeter());
    }
    public static void print2Rect(Rettangolo rect, Rettangolo rect2){

        print1Rect(rect);
        print1Rect(rect2);

        int totalArea = rect.area() + rect2.area();
        int totalPerimeter = rect.perimeter() + rect2.perimeter();

        System.out.println("Total Areas are: " + totalArea);
        System.out.println("Total Perimeters are: " + totalPerimeter);
    }

}
