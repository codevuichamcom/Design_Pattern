package com.example.demo.adaptee;

import com.example.demo.utils.NetworkLatencyFaker;

public class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        NetworkLatencyFaker.experienceNetworkLatency();
        System.out.println(words);
    }
}
