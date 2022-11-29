package com.example.demo.subject;

import com.example.demo.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAll(String message);
}
