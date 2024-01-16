package it.epicode.week2.day1.es3;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;


    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x)  throws BancaException {
        double calcoloSaldo = saldo - x;
        if (nMovimenti < maxMovimenti & calcoloSaldo > 0){
            saldo= calcoloSaldo;
        } else{
             throw new BancaException("Il tuo conto è in rosso!");
        }
        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }
}

