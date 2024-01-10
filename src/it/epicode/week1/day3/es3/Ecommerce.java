package it.epicode.week1.day3.es3;


public class Ecommerce {

    public static void main(String[] args) {


        Article article1 = new Article(1,"ciao",22.9, 9);
        Article article2 = new Article(2,"ciaoo",5, 11);
        Article[] articles = {article1, article2};


        Client client1 = new Client(22, "Mario", "mario@", 11);

        Cart cart1 = new Cart(client1, articles);
        System.out.println(cart1.getTotalCart());

    }

}
