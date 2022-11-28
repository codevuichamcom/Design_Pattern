package com.example.demo.adapter;

import com.example.demo.adaptee.JapaneseAdaptee;
import com.example.demo.target.VietnameseTarget;
import com.example.demo.utils.NetworkLatencyFaker;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading vietnamese words ...");
        NetworkLatencyFaker.experienceNetworkLatency();
        System.out.println(words);
        String japaneseWords = this.translate(words);
        NetworkLatencyFaker.experienceNetworkLatency();
        this.adaptee.receive(japaneseWords);
    }

    private String translate(String words) {
        System.out.println("Translated!");
        return "こんにちは";
    }

}