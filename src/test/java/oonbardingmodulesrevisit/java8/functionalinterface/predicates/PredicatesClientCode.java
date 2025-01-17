package oonbardingmodulesrevisit.java8.functionalinterface.predicates;

import oonbardingmodulesrevisit.java8.ProductClass;

import java.util.ArrayList;
import java.util.List;

public class PredicatesClientCode {
    /*
     Print all the products from the given list of product if the product price is greaterthan 100/-
     which are in electronics category.

     */
    public static void main(String[] args) {

        List<ProductClass> listOfProducts= new ArrayList<>();
        listOfProducts.add(new ProductClass("Detergent",34.55,"HomeProducts",'A'));
    }
}
