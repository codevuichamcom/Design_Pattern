package com.example.demo.shape;

import com.example.demo.color.Color;

public class CircleShape extends Shape {

    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public void displayInfor() {
        System.out.print("Circle Shape has color is : ");
        this.color.applyColor();

    }

}
