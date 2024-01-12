package it.epicode.week1.day5Verifica;

abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo){
        this.titolo = titolo;
    }

    public abstract void esegui();
}
