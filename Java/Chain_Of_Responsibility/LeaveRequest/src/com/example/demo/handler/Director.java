package com.example.demo.handler;

public class Director extends Approver {

    public Director(Approver nextApprover) {
        super(nextApprover);
    }

    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays > 5;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("[Director] approve request " + leaveRequest.getDays() + " days");
    }

}
