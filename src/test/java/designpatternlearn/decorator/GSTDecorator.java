package designpatternlearn.decorator;

// Concrete Decorators for Taxes
public class GSTDecorator extends PizzaDecorator {
    public GSTDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", GST Applied";
    }

    @Override
    public double getCost() {
        return pizza.getCost() * 1.18; // Applying 18% GST
    }
}