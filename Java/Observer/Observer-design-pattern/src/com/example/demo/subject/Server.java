package com.example.demo.subject;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.observer.Observer;

public class Server implements Subject {

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }

    }

    @Override
    public void notifyAll(String message) {
        for (Observer observer : observerList) {
            observer.showMessage(message);
        }
    }

}
