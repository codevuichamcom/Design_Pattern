package com.example.demo.shape;

import com.example.demo.color.Color;

public class SquareShape extends Shape {

    public SquareShape(Color color) {
        super(color);
    }

    @Override
    public void displayInfor() {
        System.out.print("Square Shape has color is : ");
        this.color.applyColor();
    }

}
