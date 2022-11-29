package com.example.demo.observer;

import com.example.demo.subject.Subject;

public interface Observer {
    void join(Subject subject);

    void showMessage(String message);

    void ping(Subject subject, String message);
}
