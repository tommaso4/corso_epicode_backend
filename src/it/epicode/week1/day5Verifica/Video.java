package it.epicode.week1.day5Verifica;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;



    public Video (String titolo, int durata, int volume, int luminosita){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void alzaVolume(){
        if (volume <= 5){
            volume ++;
        }else {
            System.out.println("Volume massimo raggiunto!");
        }
    }
    public void abbassaVolume(){
        if (volume > 0){
            volume --;
        }else {
            System.out.println("Volume minimo raggiunto!");
        }
    }
    public void alzaLuminosita(){
        if (luminosita <= 5){
            luminosita ++;
        }else {
            System.out.println("luminosita massima raggiunto!");
        }
    }
    public void abbassaLuminosita(){
        if (luminosita > 0){
            luminosita --;
        }else {
            System.out.println("luminosita minima raggiunto!");
        }
    }

    @Override
    public void play(){

        String str = "";
        String dot = "!";
        String str2 = "";
        String dot2 = "*";

        for (int i = 0; i < volume;i++){
            str += dot;
        }

        for (int i = 0; i < luminosita;i++){
            str2 += dot2;
        }

        for (int i = 0; i < durata; i++){
            System.out.println(titolo + str);
            System.out.println(titolo + str2);
        }
    }

    @Override
    public void esegui(){
        play();
    }
}
