package oonbardingmodulesrevisit.java8.functionalinterface.predicates;

import oonbardingmodulesrevisit.java8.ProductClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesClientCode {
    /*
     Print all the products from the given list of product if the product price is greaterthan 100/-
     which are in electronics category.

     */
    public static void main(String[] args) {

        List<ProductClass> listOfProducts = new ArrayList<>();
        listOfProducts.add(new ProductClass("Detergent", 34.55, "HomeProducts", 'H'));
        listOfProducts.add(new ProductClass("Sony TV", 89999, "Electronics", 'E'));
        listOfProducts.add(new ProductClass("Washing Machine", 14999, "Home Appliances", 'H'));
        listOfProducts.add(new ProductClass("HeadSet-JBL", 788.50, "Electronics", 'E'));
        listOfProducts.add(new ProductClass("Cakes-plum", 249.99, "Foods", 'F'));
        listOfProducts.add(new ProductClass("25 KG Rice", 788.50, "Foods", 'F'));
        listOfProducts.add(new ProductClass("Laptop Keyboard", 499.99, "Electronics", 'E'));

        listOfProducts.add(new ProductClass("Toothbrush", 18.99, "HomeProducts", 'H'));
        listOfProducts.add(new ProductClass("Biscuits and Snakes", 145.99, "Foods", 'F'));

        //approach 1 without streams
        Predicate<ProductClass> product = p -> p.getPrice() > 100 &&
                p.getCategory().equalsIgnoreCase("Electronics");

        for (ProductClass products : listOfProducts) {
            if (product.test(products)) {
                System.out.println(products.toString());
            }

            //approach 2: with streams
            System.out.println("Below is via Streams");
            listOfProducts.stream().filter(p -> p.getPrice() > 100 &&
                            p.getCategory().equalsIgnoreCase("Electronics")).
                    forEach(p -> System.out.println(p.toString()));

        }

    }
}
