package com.example.demo;

import com.example.demo.context.WorkFlowContext;
import com.example.demo.state.DoneWorkFlow;
import com.example.demo.state.InprogresWorkFlow;
import com.example.demo.state.RejectWorkFlow;
import com.example.demo.state.TodoWorkFlow;

public class App {
    public static void main(String[] args) throws Exception {
        WorkFlowContext context = new WorkFlowContext();
        context.setWorkFlow(new TodoWorkFlow());
        context.applyWorkFlow();

        context.setWorkFlow(new InprogresWorkFlow());
        context.applyWorkFlow();

        context.setWorkFlow(new RejectWorkFlow());
        context.applyWorkFlow();

        context.setWorkFlow(new InprogresWorkFlow());
        context.applyWorkFlow();

        context.setWorkFlow(new DoneWorkFlow());
        context.applyWorkFlow();
    }
}
