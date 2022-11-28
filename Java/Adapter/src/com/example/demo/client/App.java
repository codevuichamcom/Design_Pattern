package com.example.demo.client;

import com.example.demo.adaptee.JapaneseAdaptee;
import com.example.demo.adapter.TranslatorAdapter;
import com.example.demo.target.VietnameseTarget;

public class App {
    public static void main(String[] args) throws Exception {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin Chao");
    }
}
