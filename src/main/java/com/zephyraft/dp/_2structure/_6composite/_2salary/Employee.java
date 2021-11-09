package com.zephyraft.dp._2structure._6composite._2salary;

public class Employee extends HumanResource {
    public Employee(long id, double salary){
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
