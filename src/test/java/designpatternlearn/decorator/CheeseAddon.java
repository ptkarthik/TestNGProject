package designpatternlearn.decorator;

// Concrete Decorators for Add-ons
public class CheeseAddon extends PizzaDecorator {
    public CheeseAddon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50.0; // Cheese add-on cost
    }
}