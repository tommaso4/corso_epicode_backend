package it.epicode.week2.day2.es3HashMap;

public class UseRubrica {
    public static void main(String[] args) {

        RubricaTel rubricaTel = new RubricaTel();
        rubricaTel.addElement("Mario",12345);
        rubricaTel.addElement("Luigi",12346);
        rubricaTel.addElement("Letizia",12347);
        System.out.println(rubricaTel);

        rubricaTel.cancelByName("Letizi");
        System.out.println(rubricaTel);

        rubricaTel.getNameOfNumber(12345);
        rubricaTel.getNumByName("Mario");
    }
}
