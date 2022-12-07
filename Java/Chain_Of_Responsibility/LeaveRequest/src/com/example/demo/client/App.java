package com.example.demo.client;

import com.example.demo.handler.LeaveRequest;
import com.example.demo.utils.LeaveRequestWorkFlow;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n-------------------------------------------------");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(2));
        System.out.println("\n-------------------------------------------------");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(5));
        System.out.println("\n-------------------------------------------------");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(7));
    }
}
