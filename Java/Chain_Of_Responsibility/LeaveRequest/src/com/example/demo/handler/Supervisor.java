package com.example.demo.handler;

public class Supervisor extends Approver {

    public Supervisor(Approver nextApprover) {
        super(nextApprover);
    }

    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays <= 2;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("[Supervisor] approve request " + leaveRequest.getDays() + " days");
    }

}
