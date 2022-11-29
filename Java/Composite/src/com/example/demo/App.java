package com.example.demo;

import java.util.List;

public class App {

    public static void main(String[] args) {
        FileComponent folder1 = new FolderComposite(
                List.of(
                        new FileLeaf(10, "file1"),
                        new FileLeaf(5, "file2"),
                        new FileLeaf(15, "file5")),
                "Folder1");

        FileComponent folder2 = new FolderComposite(List.of(folder1), "folder2");
        FileComponent folder3 = new FolderComposite(List.of(folder2), "folder3");
        folder3.showProperty();
        System.out.println("total size: " + folder3.totalSize());
    }

}
