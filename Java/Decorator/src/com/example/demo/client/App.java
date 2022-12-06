package com.example.demo.client;

import com.example.demo.commonInterface.EmployeeComponent;
import com.example.demo.concrete.EmployeeConcreteComponent;
import com.example.demo.decorator.Manager;
import com.example.demo.decorator.TeamLeader;
import com.example.demo.decorator.TeamMember;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nMEMBER: ");
        EmployeeComponent teamMember = new TeamMember(employee);
        teamMember.showBasicInformation();
        teamMember.doTask();

        System.out.println("\nLEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(teamMember);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(teamLeader);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nBOSS: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
