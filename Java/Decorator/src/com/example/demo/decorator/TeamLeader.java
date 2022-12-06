package com.example.demo.decorator;

import com.example.demo.commonInterface.EmployeeComponent;

public class TeamLeader extends EmployeeDecorator {

    public TeamLeader(EmployeeComponent employee) {
        super(employee);
    }

    public void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }

    public void motivate() {
        System.out.println(this.employee.getName() + " is motivating his members.");
    }

    public void monitor() {
        System.out.println(this.employee.getName() + " is monitoring his members.");
    }

    @Override
    public void doTask() {
        this.employee.doTask();
        this.planing();
        this.motivate();
        this.monitor();
    }

}
