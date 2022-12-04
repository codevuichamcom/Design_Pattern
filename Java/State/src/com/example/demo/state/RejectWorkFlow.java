package com.example.demo.state;

public class RejectWorkFlow implements WorkFlow {

    @Override
    public void handleWorkFlow() {
        System.out.println("Reject state...");
    }

}
