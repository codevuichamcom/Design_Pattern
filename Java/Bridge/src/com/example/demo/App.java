package com.example.demo;

import com.example.demo.color.BlueColor;
import com.example.demo.color.RedColor;
import com.example.demo.shape.CircleShape;
import com.example.demo.shape.Shape;
import com.example.demo.shape.SquareShape;

public class App {
    public static void main(String[] args) throws Exception {
        Shape circle = new CircleShape(new RedColor());
        circle.displayInfor();

        Shape square = new SquareShape(new BlueColor());
        square.displayInfor();
    }
}
