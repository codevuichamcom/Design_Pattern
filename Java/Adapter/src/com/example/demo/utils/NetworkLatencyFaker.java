package com.example.demo.utils;

import java.util.Random;

public class NetworkLatencyFaker {
    public static void experienceNetworkLatency() {
        try {
            Thread.sleep(new Random().nextInt(1000, 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
