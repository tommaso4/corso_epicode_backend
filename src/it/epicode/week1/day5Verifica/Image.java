package it.epicode.week1.day5Verifica;

public class Image extends ElementoMultimediale {
    private int luminosita;


    public Image(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void alzaLuminosita() {
        if (luminosita <= 5) {
            luminosita++;
        } else {
            System.out.println("luminosita massima raggiunto!");
        }
    }

    public void abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        } else {
            System.out.println("luminosita minima raggiunto!");
        }
    }
    private void show() {

        String str2 = "";
        String dot2 = "*";

        for (int i = 0; i < luminosita; i++) {
            str2 += dot2;
        }

        System.out.println(titolo + str2);
    }


    @Override
    public void esegui() {
        show();
    }
}