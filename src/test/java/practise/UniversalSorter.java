package practise;

import java.util.*;
import java.util.stream.Collectors;

public class UniversalSorter {

    // Universal sort method
    public static <T> List<T> universalSort(List<T> list, Comparator<T> comparator) {
        return list.stream()
                .sorted(comparator) // Apply the provided comparator
                .collect(Collectors.toList()); // Collect sorted results into a new list
    }

    public static void main(String[] args) {
        // Example 1: Sorting integers in ascending order
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);
        List<Integer> sortedNumbers = universalSort(numbers, Comparator.naturalOrder());
        System.out.println("Ascending order: " + sortedNumbers); // [1, 2, 5, 7, 9]

        // Example 2: Sorting integers in descending order
        List<Integer> reversedNumbers = universalSort(numbers, Comparator.reverseOrder());
        System.out.println("Descending order: " + reversedNumbers); // [9, 7, 5, 2, 1]

        // Example 3: Sorting strings in ascending order
        List<String> names = Arrays.asList("Charlie", "Alice", "David", "Bob");
        List<String> sortedNames = universalSort(names, Comparator.naturalOrder());
        System.out.println("Names ascending: " + sortedNames); // [Alice, Bob, Charlie, David]

        // Example 4: Sorting strings in descending order
        List<String> reversedNames = universalSort(names, Comparator.reverseOrder());
        System.out.println("Names descending: " + reversedNames); // [David, Charlie, Bob, Alice]

        // Example 5: Sorting custom objects by a field
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30)
        );
        // Sort by age in ascending order
        List<Person> sortedByAge = universalSort(people, Comparator.comparing(Person::getAge));
        System.out.println("Sorted by age (ascending): " + sortedByAge);

        // Sort by name in descending order
        List<Person> sortedByName = universalSort(people, Comparator.comparing(Person::getName).reversed());
        System.out.println("Sorted by name (descending): " + sortedByName);
    }
}

// Person class for custom sorting example
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

