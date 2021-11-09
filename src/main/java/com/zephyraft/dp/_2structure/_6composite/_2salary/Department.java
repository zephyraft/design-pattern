package com.zephyraft.dp._2structure._6composite._2salary;

import java.util.ArrayList;
import java.util.List;

public class Department extends HumanResource {
    private List<HumanResource> subNodes;

    public Department(long id) {
        super(id);
        subNodes = new ArrayList<>();
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for (HumanResource hr : subNodes) {
            totalSalary += hr.calculateSalary();
        }
        this.salary = totalSalary;
        return totalSalary;
    }

    public void addSubNode(HumanResource hr) {
        subNodes.add(hr);
    }
}
