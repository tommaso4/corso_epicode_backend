package it.epicode.week2.day1.es3;

public class ContoOnLine extends ContoCorrente {
    double maxPrelievo;

    ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {
        System.out.println("Titoloare"+ titolare+"Saldo "+ saldo +"-num Movimenti "+ nMovimenti+
                "-Massimo movimenti"+maxMovimenti + "-massimo prelievo"+ maxPrelievo);
    }

    void preleva(double x) throws BancaException {
        if (x > maxPrelievo){
            throw new BancaException("Prelievo non disponibile");
        } else {
            super.preleva(x);
        }
    }
}
