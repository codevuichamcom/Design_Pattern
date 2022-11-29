package com.example.demo.observer;

import com.example.demo.subject.Subject;

public class CharacterImpl implements Observer {
    private String name;

    public CharacterImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void join(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void showMessage(String message) {
        System.out.println("================================================");
        System.out.println(String.format("In %s account: ", this.name));
        System.out.println(message);
        System.out.println("================================================\n\n");

    }

    @Override
    public void ping(Subject subject, String message) {
        subject.notifyAll(message);
    }

}
