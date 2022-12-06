package com.example.demo.decorator;

import java.util.Date;

import com.example.demo.commonInterface.EmployeeComponent;

public abstract class EmployeeDecorator implements EmployeeComponent {

    protected EmployeeComponent employee;

    protected EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.employee.getName();
    }

    @Override
    public void join(Date joinDate) {
        this.employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        this.employee.terminate(terminateDate);
    }

}
