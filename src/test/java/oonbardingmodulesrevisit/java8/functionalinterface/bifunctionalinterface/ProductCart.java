package oonbardingmodulesrevisit.java8.functionalinterface.bifunctionalinterface;

import oonbardingmodulesrevisit.java8.ProductClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class ProductCart {
    /*
    Given the Product and quantity of the products, write a BiFunction to calculate the cost of products.
     A cart is a map of product and quantity. Given the cart, calculate the cost of the cart.
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

        Map<ProductClass, Integer> productCart = new HashMap<>();
        productCart.put(listOfProducts.get(0), 4);
        productCart.put(listOfProducts.get(2), 3);
        productCart.put(listOfProducts.get(1), 4);
        productCart.put(listOfProducts.get(5), 12);
        productCart.put(listOfProducts.get(6), 2);
        productCart.put(listOfProducts.get(8), 24);

        BiFunction<ProductClass, Integer, Double> bifunction =
                (cart, qty) -> cart.getPrice() * qty;

        for (Map.Entry<ProductClass, Integer> k : productCart.entrySet()) {
            System.out.println("the total value of product " + k.getKey().getName() + " " +
                    "is " + bifunction.apply(k.getKey(), k.getValue()));
        }
    }
}
