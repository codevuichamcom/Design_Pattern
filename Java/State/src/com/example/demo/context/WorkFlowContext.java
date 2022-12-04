package com.example.demo.context;

import com.example.demo.state.WorkFlow;

public class WorkFlowContext {
    private WorkFlow workFlow;

    public void setWorkFlow(WorkFlow workFlow) {
        this.workFlow = workFlow;
    }

    public void applyWorkFlow() {
        this.workFlow.handleWorkFlow();
        System.out.println();
    }
}
