package oonbardingmodulesrevisit.java8.constructorreference;

import oonbardingmodulesrevisit.java8.Employee;

public class ConstructrReferenceCheck {
    /*
    1. Write a program get the details of Employee Object , such as name,account,salary ,
    where Employee class has parameterized constructor using constructor reference
     */

    public static void main(String[] args) {

        ConstructorReference<String, String, Double, Employee> constructorReference = Employee::new;
        Employee emp = constructorReference.getEmployee("karthik", "2345", 159000.00);

    }
}
