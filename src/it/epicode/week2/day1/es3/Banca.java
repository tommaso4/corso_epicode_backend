package it.epicode.week2.day1.es3;

import ch.qos.logback.classic.Logger;
import it.epicode.week2.day1.es2.UseConsumo;
import org.slf4j.LoggerFactory;

public class Banca {

    private static final ch.qos.logback.classic.Logger logger = (Logger) LoggerFactory.getLogger(Banca.class);
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Mario Grossi", 20000.0);

        System.out.println( "saldo: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(200);
            System.out.println("saldo: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();

        } catch (BancaException e) {
            System.out.println("errore durante il prelievo"+ e);
            e.printStackTrace();
            logger.error(e.getMessage());

        }
    }
}



