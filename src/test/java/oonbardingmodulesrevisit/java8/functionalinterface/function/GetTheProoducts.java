package oonbardingmodulesrevisit.java8.functionalinterface.function;

import oonbardingmodulesrevisit.java8.ProductClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GetTheProoducts {
    /*
    4. Write a function to get all the products whose price is is > 1000/-
    and belongs to electronic category.

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

        //approach1:
        Function<ProductClass, String> g = p -> p.getPrice() > 100 && p.getCategory().
                equalsIgnoreCase("Electronics") ? p.getName() + " price above " +
                "100" : p.getName() + " Price is not above 100";
        for (ProductClass l : listOfProducts) {
            System.out.println(g.apply(l));
        }


    }
}
