package it.epicode.week2.day1.es2;

public class KmForLiter {

    private int km = 0;
    private int l = 0;

    private double consumo;

    public KmForLiter(int km, int l) throws KmExeption {
        this.km = km;
        this.l = l;
        this.consumo = setConsumo(km, l);
    }

    private double setConsumo(int km, int l) throws KmExeption {
            if (l != 0){
               return (double) km / l;
            }else {
                throw new KmExeption("numero inserito = 0");
            }
    }

    public double getConsumo() {
        return consumo;
    }
}
