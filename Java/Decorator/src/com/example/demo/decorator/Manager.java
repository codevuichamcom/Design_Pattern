package com.example.demo.decorator;

import com.example.demo.commonInterface.EmployeeComponent;

public class Manager extends EmployeeDecorator {

    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        this.employee.doTask();
        this.createRequirement();
        this.assignTask();
        this.manageProgress();
    }

}
