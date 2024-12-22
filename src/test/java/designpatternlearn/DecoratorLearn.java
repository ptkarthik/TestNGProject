package designpatternlearn;


import designpatternlearn.decorator.*;

public class DecoratorLearn {
    // Client Code

    public static void main(String[] args) {
        // Create a plain pizza
        Pizza myPizza = new PlainPizza();

//        System.out.println(myPizza.getCost());
//        System.out.println(myPizza.getDescription());

        // Add extra cheese
        myPizza = new CheeseAddon(myPizza);
//        System.out.println(myPizza.getCost());
//        System.out.println(myPizza.getDescription());
//
        // Add mushrooms
        myPizza = new MushroomAddon(myPizza);
        System.out.println(myPizza.getCost());
        System.out.println(myPizza.getDescription());
//
//        // Apply GST
//        myPizza = new GSTDecorator(myPizza);
//
//        // Apply Service Tax
//        myPizza = new ServiceTaxDecorator(myPizza);
//
//        // Print the final description and cost
//        System.out.println("Order: " + myPizza.getDescription());
//        System.out.println("Total Cost: ₹" + myPizza.getCost());
    }
}


