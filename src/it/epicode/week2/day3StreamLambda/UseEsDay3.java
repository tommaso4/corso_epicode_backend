package it.epicode.week2.day3StreamLambda;

import java.time.LocalDate;
import java.util.List;

public class UseEsDay3 {
    public static void main(String[] args) {

        //es1 ListaProdotti
        System.out.println("es1");
        List<Product> productList = makeProductList();
        System.out.println(productList);
        //ListaOrdiniFiltrati
        List<Product> filteredProductsList = filterByCategoryPrice(productList, "Books",100);
        System.out.println(filteredProductsList);

        //es2
        System.out.println("es2");
        Costumer costumer1 = new Costumer(1L,"Mario Rossi", 2);
        Costumer costumer2 = new Costumer(2L,"Mario Bianchi", 2);
        Costumer costumer3 = new Costumer(3L,"Mario Verdi", 1);

        Order order1 = new Order(1L,"Building",productList,costumer1, LocalDate.of(2021,01,01));
        Order order2 = new Order(2L,"Building",productList,costumer2,LocalDate.of(2021,02,04));
        Order order3 = new Order(3L,"Building",productList,costumer3,LocalDate.of(2021,01,01));
        System.out.println(order1);
        List<Product> filteredListOrder = filterByCategoryPrice(order1.getProducts(),"Baby",0);
        order1.setProducts(filteredListOrder);
        System.out.println(order1);
        //order1.getProducts().removeIf(p -> !p.getCategory().equals("Baby") || p.getPrice() <= 0);

        //es3
        System.out.println("es3");
        List<Product> filteredProductsLis2 = filterByCategoryPrice(productList, "Boys",0);
        System.out.println(filteredProductsLis2);
        List<Product> scountList = filteredProductsLis2.stream().map
                (p -> new Product(p.getId(),p.getName(),p.getCategory(),p.getPrice()*0.8)).toList();
        System.out.println(scountList);

        //es4
        System.out.println("es4");
        List<Order> orderList = List.of(order3,order2,order1);
        List<Order> filteredOrder = orderList.stream().filter(o -> o.getCostumer().getTier().equals(2)
                && o.getOrderDate().isAfter(LocalDate.of(2021,02,01))
                && o.getOrderDate().isBefore(LocalDate.of(2021,04,01))).toList();
        System.out.println(filteredOrder);



    }

    static List<Product> makeProductList(){
        //Prodotti
        Product product1 = new Product(1L,"King Of the  rings1", "Books", 22.0);
        Product product2 = new Product(2L,"King Of the  rings2", "Books", 125.0);
        Product product3 = new Product(3L,"Cappucceto Rosso1", "Baby", 12.0);
        Product product4 = new Product(4L,"Cappucceto Rosso2", "Baby", 15.0);
        Product product5 = new Product(5L,"Storia Medievale1", "Boys", 35.0);
        Product product6 = new Product(6L,"Storia Medievale2", "Boys", 31.0);

        List<Product> productList = List.of(product1,product2,product3,product4,product5,product6);
        return productList;
    }

    static List<Product> filterByCategoryPrice (List<Product> list, String catergory,int num){
        //Fitro lista prodotti
        List<Product> filteredProductsList = list.stream().
                filter(a -> a.getCategory().equals(catergory) && a.getPrice()> num ).toList();
        return filteredProductsList;
    }
}
