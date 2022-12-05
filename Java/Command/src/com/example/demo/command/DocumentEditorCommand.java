package com.example.demo.command;

import com.example.demo.reveiver.Document;

public class DocumentEditorCommand implements Command {

    private Document document;
    private String text;

    public DocumentEditorCommand(Document document, String text) {
        this.document = document;
        this.text = text;
        this.document.write(text);
    }

    @Override
    public void undo() {
        this.document.eraseLast();

    }

    @Override
    public void redo() {
        this.document.write(text);
    }

}
