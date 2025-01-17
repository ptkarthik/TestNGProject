package oonbardingmodulesrevisit.java8.constructorreference;

import oonbardingmodulesrevisit.java8.Employee;

public interface ConstructorReference<R, Q, T, U> {
    public U getEmployee(R name, Q accountNumber, T salary);
}
