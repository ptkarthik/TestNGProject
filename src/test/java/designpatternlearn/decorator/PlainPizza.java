package designpatternlearn.decorator;

public class PlainPizza implements Pizza {
    // Concrete Component
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.0; // Base cost of the plain pizza
    }
}