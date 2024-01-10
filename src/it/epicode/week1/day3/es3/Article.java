package it.epicode.week1.day3.es3;

public class Article {

    private int codeArticle;
    private String description;
    private double price;
    private int numDisponib;

    public Article (int codeArticle, String description, double price, int numDisponib){
        this.codeArticle = codeArticle;
        this.description = description;
        this.price = price;
        this.numDisponib = numDisponib;
    }

    public void setCodeArticle (int codeArticle){
        this.codeArticle = codeArticle;
    }

    public int getCodeArticle(){
        return this.codeArticle;
    }
    public void setnumDisponib (int numDisponib){
        this.numDisponib = numDisponib;
    }

    public int getnumDisponib(){
        return this.numDisponib;
    }
    public void setdescription (String description){
        this.description = Article.this.description;
    }

    public String getdescription(){
        return this.description;
    }
    public void setprice (double price){
        this.price = price;
    }

    public double getprice(){
        return this.price;
    }

}
