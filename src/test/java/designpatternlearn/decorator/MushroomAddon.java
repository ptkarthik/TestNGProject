package designpatternlearn.decorator;

public class MushroomAddon extends PizzaDecorator {
    public MushroomAddon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 70.0; // Mushroom add-on cost
    }
}