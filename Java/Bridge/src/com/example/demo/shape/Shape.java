package com.example.demo.shape;

import com.example.demo.color.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void displayInfor();
}
