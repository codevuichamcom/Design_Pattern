package com.example.demo.handler;

/**
 * Approver
 */
public abstract class Approver {
    protected Approver nextApprover;

    protected Approver(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void approveLeave(LeaveRequest leaveRequest) {
        System.out.println("Checking permission for " + this.getClass().getSimpleName());
        if (canApprove(leaveRequest.getDays())) {
            doApproving(leaveRequest);
        } else {
            System.out.println("-> Foward to " + this.nextApprover.getClass().getSimpleName());
            this.nextApprover.approveLeave(leaveRequest);
        }
    }

    protected abstract boolean canApprove(int numberOfDays);

    protected abstract void doApproving(LeaveRequest leaveRequest);

}