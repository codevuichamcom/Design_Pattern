package com.example.demo.concrete;

import java.util.Date;

import com.example.demo.commonInterface.EmployeeComponent;

public class EmployeeConcreteComponent implements EmployeeComponent {

    private String name;

    public EmployeeConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void doTask() {
        // Unassigned task
    }

    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName() + " joined on " + this.formatDate(joinDate));
    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));
    }

}
