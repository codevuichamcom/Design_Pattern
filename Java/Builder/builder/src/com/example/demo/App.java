package com.example.demo;

public class App {

    public static void main(String[] args) {
        System.out.println("Main");

        User user = User.builder().id(10).name("Quan").build();
        System.out.println(user);

    }

}
