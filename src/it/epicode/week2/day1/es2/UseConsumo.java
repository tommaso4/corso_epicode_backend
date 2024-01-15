package it.epicode.week2.day1.es2;

import ch.qos.logback.classic.Logger;
import it.epicode.week2.day1.es1.UseArr;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UseConsumo {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(UseConsumo.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero per i km");
        int km = scanner.nextInt();
        System.out.println("inserisci un numero per i l");
        int l = scanner.nextInt();

        try {
            KmForLiter consumo = new KmForLiter(km,l);
            System.out.println(consumo.getConsumo());
        }catch (KmExeption e){
            logger.error("litri = 0");
        }

    }
}
