package java8.cnstructormethodreferences;

public class FactoryCreator {

    public static Animal createAnimal(String animal) {
        switch (animal.toLowerCase()) {
            case "cat": {
                return new Cat();

            }
            case "dog": {
                return new Dog();

            }
        }
        return null;
    }
}
