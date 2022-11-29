package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent {
    public List<FileComponent> files = new ArrayList<>();
    public String folderName;

    public FolderComposite(List<FileComponent> files, String folderName) {
        this.files = files;
        this.folderName = folderName;
    }

    @Override
    public void showProperty() {
        System.out.println(this.folderName + " {");
        files.stream().forEach(file -> {
            file.showProperty();
        });
        System.out.println("}");
    }

    @Override
    public long totalSize() {
        return this.files.stream()
                .mapToLong(file -> file.totalSize())
                .sum();
    }

}
