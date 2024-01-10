package it.epicode.week1.day3.es3;

public class Cart {

    private Client clientMatch;
    private Article[] articles;

    private double totalCart;

    public Cart (Client clientMatch, Article[] articles){
        this.clientMatch = clientMatch;
        this.articles = articles;
        setTotalCart(articles);
    }

    public void setTotalCart(Article[] articles) {
        for (Article art : articles){
            totalCart +=  art.getprice();
        }
    }

    public double getTotalCart() {
        return totalCart;
    }
}
