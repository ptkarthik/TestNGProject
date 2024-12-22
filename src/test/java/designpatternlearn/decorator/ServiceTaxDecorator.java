package designpatternlearn.decorator;

public class ServiceTaxDecorator extends PizzaDecorator {
    public ServiceTaxDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Service Tax Applied";
    }

    @Override
    public double getCost() {
        return pizza.getCost() * 1.05; // Applying 5% Service Tax
    }
}
