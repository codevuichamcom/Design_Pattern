package com.example.demo.utils;

import com.example.demo.handler.Approver;
import com.example.demo.handler.DeliveryManager;
import com.example.demo.handler.Director;
import com.example.demo.handler.Supervisor;

public class LeaveRequestWorkFlow {
    public static Approver getApprover() {
        Approver director = new Director(null);
        Approver deliveryManager = new DeliveryManager(director);
        Approver supervisor = new Supervisor(deliveryManager);
        return supervisor;
    }
}
