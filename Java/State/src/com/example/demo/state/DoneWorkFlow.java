package com.example.demo.state;

public class DoneWorkFlow implements WorkFlow {

    @Override
    public void handleWorkFlow() {
        System.out.println("Done state...");
    }

}
