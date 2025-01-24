package practise.enumdata;

public enum Car {
    TOYOTA("Camry", 2020),
    BMW("X5", 2021),
    MERCEDES("E-Class", 2022),
    AUDI("Q7", 2020);

    private final String model;
    private final int year;

    // Constructor with two arguments
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        for (Car car : Car.values()) {
            System.out.println(car.name() + ": " + car.getModel() + " (" + car.getYear() + ")");
        }
    }
}
