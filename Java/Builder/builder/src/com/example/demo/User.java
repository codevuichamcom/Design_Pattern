package com.example.demo;

public class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

    public static User.UserBuilder builder() {
        return new User.UserBuilder();
    }

    public static class UserBuilder {
        private int id;
        private String name;

        public User.UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public User.UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(this.id, this.name);
        }

    }

}
