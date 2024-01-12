package it.epicode.week1.day5Verifica;

public class Audio extends ElementoMultimediale implements Riproducibile {

    private int durata;
    private int volume;

    public Audio (String titolo, int durata, int volume){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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

    @Override
    public void play(){

        String str = "";
        String dot = "!";

        for (int i = 0; i < volume;i++){
            str += dot;
        }

        for (int i = 0; i < durata; i++){
            System.out.println(titolo + str);
        }
    }


    @Override
    public void esegui(){
        play();
    }
}
