package it.epicode.week1.day5Verifica;

import java.util.Scanner;

public class LettoreMultimediale {


    public static void main(String[] args) {

        Video video = new Video("v1", 2, 2, 2);
        Audio audio = new Audio("v2", 2, 2);
        Audio audio2 = new Audio("v3", 2, 2);
        Audio audio3 = new Audio("v4", 2, 2);
        Image img = new Image("v5", 2);

        Scanner scanner = new Scanner(System.in);

//        ElementoMultimediale[] elementi = addElements(scanner);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        elementi[0]= video;
        elementi[1]= audio;
        elementi[2]= audio2;
        elementi[3]= audio3;
        elementi[4]= img;

        riproduciElementi(scanner, elementi);
    }

    public static ElementoMultimediale[] addElements(Scanner scanner) {

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci il titolo per l'elemento " + (i + 1) + ": ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci un tipo: img = 1; video = 2; audio = 3");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("inserisci luminosità");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Image(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("inserisci durata");
                    int durataVideo = scanner.nextInt();
                    System.out.println("inserisci volume");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("inserisci luminosità");
                    int luminositàVideo = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositàVideo);
                    break;
                case 3:
                    System.out.println("inserisci durata");
                    int durataAudio = scanner.nextInt();
                    System.out.println("inserisci volume");
                    int volumeAudio = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
            }
        }
        return elementi;
    }

    public static void riproduciElementi(Scanner scanner, ElementoMultimediale[] elementi) {

        int indexEl;

        do {
            System.out.println("inserisci un numero da 1 a 5 per riprodurre un elementoMultimedialle." +
                    " Inserisci 0 per fermarti");
            indexEl = scanner.nextInt();

            if (indexEl > 0 && indexEl <= elementi.length) {
                elementi[indexEl -1].esegui();
            }else if (indexEl != 0) {
                System.out.println("Indice non valido.");
            }
        } while (indexEl != 0);
    }

}
