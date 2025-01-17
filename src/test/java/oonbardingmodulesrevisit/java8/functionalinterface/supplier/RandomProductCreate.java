package oonbardingmodulesrevisit.java8.functionalinterface.supplier;

import oonbardingmodulesrevisit.java8.ProductClass;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class RandomProductCreate {
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

        Supplier<ProductClass> supplier = () -> {
            SecureRandom randomProductGeneratin = new SecureRandom();
            return listOfProducts.get(randomProductGeneratin.nextInt(listOfProducts.size()));
        };

        System.out.println(supplier.get().toString());

    }

    ;
}

