package com.example.demo;

public class FileLeaf implements FileComponent {

    private long size;
    private String fileName;

    public FileLeaf(int size, String fileName) {
        this.size = size;
        this.fileName = fileName;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name=" + this.fileName + ", size=" + this.size + "]");

    }

    @Override
    public long totalSize() {
        return this.size;
    }

}
