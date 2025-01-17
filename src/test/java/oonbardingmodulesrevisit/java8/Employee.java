package oonbardingmodulesrevisit.java8;

public class Employee {
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", acctNumber='" + acctNumber + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String acctNumber;
    private double salary;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public Employee(String name, String acctNumber, double salary) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.salary = salary;
    }

}
