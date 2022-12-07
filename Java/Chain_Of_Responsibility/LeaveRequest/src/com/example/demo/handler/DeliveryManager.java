package com.example.demo.handler;

public class DeliveryManager extends Approver {

    public DeliveryManager(Approver nextApprover) {
        super(nextApprover);
    }

    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays > 2 && numberOfDays <= 5;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("[Delivery Manager] approve request " + leaveRequest.getDays() + " days");
    }

}
