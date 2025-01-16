package practise.java8operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class StreamOperationsExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 55000),
                new Employee(2, "Bob", "IT", 70000),
                new Employee(3, "Charlie", "Finance", 80000),
                new Employee(4, "David", "IT", 90000),
                new Employee(5, "Eve", "HR", 60000),
                new Employee(6, "Frank", "Finance", 75000),
                new Employee(7, "Grace", "IT", 85000),
                new Employee(8, "Hank", "Finance", 80000),
                new Employee(9, "Ivy", "IT", 90000)
        );

        // Filter: Employees with a salary greater than 75000
        System.out.println("Filtered Employees (Salary > 75000):");
        employees.stream()
                .filter(emp -> emp.getSalary() > 75000)
                .forEach(System.out::println);

        // Map: Get names of all employees
        System.out.println("\npractise.Employee Names:");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        // FlatMap: Flatten a list of lists of departments (Example use)
        System.out.println("\nFlattened Department List:");
        List<List<String>> departmentLists = Arrays.asList(
                Arrays.asList("HR", "Finance"),
                Arrays.asList("IT", "Admin")
        );
        departmentLists.stream()
                .flatMap(List::stream)
                .distinct()
                .forEach(System.out::println);

        // Sorted: Sort employees by salary in descending order
        System.out.println("\nEmployees sorted by salary (Descending):");
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

        // Distinct: Filter out duplicate salaries
        System.out.println("\nDistinct Salaries:");
        employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .forEach(System.out::println);

        // Limit: Get the top 3 highest-paid employees
        System.out.println("\nTop 3 highest-paid employees:");
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(3)
                .forEach(System.out::println);

        // Skip: Skip the first 2 employees with the highest salaries
        System.out.println("\nSkipping the top 2 highest-paid employees:");
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .skip(2)
                .forEach(System.out::println);

        // Reduce: Calculate the total salary of all employees
        System.out.println("\nTotal Salary of all Employees:");
        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println(totalSalary);

        // Collect: Group employees by department
        System.out.println("\nEmployees grouped by Department:");
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(groupingBy(Employee::getDepartment));
        employeesByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });

        // Peek: Debugging intermediate stream state
        System.out.println("\nPeek Example (Filtered and Debugging Names):");
        employees.stream()
                .filter(emp -> emp.getSalary() > 75000)
                .peek(emp -> System.out.println("Filtered: " + emp))
                .map(Employee::getName)
                .forEach(name -> System.out.println("Mapped Name: " + name));
    }
}