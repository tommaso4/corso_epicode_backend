package it.epicode.week1.day4.es2;

import it.epicode.week1.day4.es1.Dipartimento;
import it.epicode.week1.day4.es1.Dipendente;
import it.epicode.week1.day4.es1.Livello;

public class GestioneClienti {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(1, Livello.OPERAIO,Dipartimento.PRODUZIONE,30);
        Dipendente dipendente2 = new Dipendente(2, Livello.OPERAIO,Dipartimento.PRODUZIONE,30);
        Dipendente dipendente3 = new Dipendente(3, Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE,30);
        Dipendente dipendente4 = new Dipendente(4, Livello.DIRIGENTE,Dipartimento.VENDITE,30);

        dipendente1.promuovi();
        dipendente3.promuovi();

        Dipendente[] dipendenti = new Dipendente[4];
        dipendenti[0] = dipendente1;
        dipendenti[1] = dipendente2;
        dipendenti[2] = dipendente3;
        dipendenti[3] = dipendente4;

        double stipendiTotal = 0;

        for (Dipendente dip : dipendenti){

            System.out.println(dip.printData());
            stipendiTotal += Dipendente.calcolaPaga(dip, 5);
        }

        System.out.println(stipendiTotal);


        double stipendioExtrà1 = Dipendente.calcolaPaga(dipendente1, 4);
        System.out.println(stipendioExtrà1);

    }
}
