package java8.cnstructormethodreferences;

public class ConstructorReferences {
    public static void main(String[] args) {
        Animal cat = FactoryCreator.createAnimal("Cat");
        cat.makeSound();
    }
}
