package practise.jan27.streams;

import java.util.Arrays;
import java.util.List;

public class NestedDataFiltering {
    public static void main(String[] args) {

        List<List<Employee>> list = Arrays.asList(Arrays.
                        asList(new Employee("Karthik", "IT", 100000),
                                new Employee("Pavithra", "HR", 50000),
                                new Employee("Harish", "MIS", 70000),
                                new Employee("Pradeep", "Gvernment", 150000)),

                Arrays.asList(new Employee("Inira", "IT", 100000),
                        new Employee("Keerthu", "HR", 50000),
                        new Employee("Madhu", "MIS", 70000),
                        new Employee("Sridhar", "Gvernment", 150000)

                ));



        list.stream().flatMap(lists -> lists.stream()).forEach(employees -> System.out.println(employees.toString()));
    }
}
