package it.epicode.week1.day4.es1;

public class Dipendente {

    //attributi statici:
    public static double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double impStraodinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.impStraodinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(int matricola, Livello livello, Dipartimento dipartimento, double impStraodinario) {
        this.matricola = matricola;
        this.livello = livello;
        this.stipendio = calcolaStipendio();
        this.dipartimento = dipartimento;
        this.impStraodinario = impStraodinario;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImpStraodinario() {
        return impStraodinario;
    }

    public void setImpStraodinario(double impStraodinario) {
        this.impStraodinario = impStraodinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public String printData() {
        String data = "Matricola: " + matricola + " stipendio: " + stipendio + " livello: " +
                livello + " dipartimento: " + dipartimento + " impStraodinario: " + impStraodinario;
        return data;
    }

    public Livello promuovi() {
        if (livello == Livello.OPERAIO) {
            livello = Livello.IMPIEGATO;
            stipendio = stipendioBase * 2;
        } else if (livello == Livello.IMPIEGATO) {
            livello = Livello.QUADRO;
            stipendio = stipendioBase * 3;
        } else if (livello == Livello.QUADRO) {
            livello = Livello.DIRIGENTE;
            stipendio = stipendioBase * 4;
        } else {
            System.out.println("Il dipendente è al massiamo livello di carrriera!");
        }

        return getLivello();
    }

    public double calcolaStipendio() {

        if (livello == Livello.OPERAIO) {
            stipendio = stipendioBase;
        } else if (livello == Livello.IMPIEGATO) {
            stipendio = stipendioBase * 2;
        } else if (livello == Livello.QUADRO) {
            stipendio = stipendioBase * 3;
        } else if (livello == Livello.DIRIGENTE) {
            stipendio = stipendioBase * 4;
        }
        return stipendio;
    }

    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double calcolaPaga(Dipendente dipendente, int ore) {
        double stipendioPar = dipendente.getStipendio();
        double extrà = ore * dipendente.getImpStraodinario();
        double stipendiExtrà = extrà + stipendioPar;
        return stipendiExtrà;
    }
}
