package oonbardingmodulesrevisit.java8.functionalinterface.consumer;

import oonbardingmodulesrevisit.java8.ProductClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PrintPrarameter {
    public static void main(String[] args) throws IOException {
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

        File file = new File("C:\\Users\\karthikeyan_thangave\\TestNGProject\\writeFile.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            Consumer<ProductClass> consumer = (p) -> {
                try {
                    if (p.getPrice() > 1000) {
                        bufferedWriter.write(p.getName());
                    } else {
                        System.out.println(p.getName() + " " + "will be lgged in consle");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };

            for (ProductClass p : listOfProducts) {
                consumer.accept(p);

            }
        }
    }
}
