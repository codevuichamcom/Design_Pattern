package com.example.demo.handler;

import com.example.demo.enums.LogLevel;

public abstract class Logger {
    protected LogLevel logLevel;
    protected Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(LogLevel severity, String msg) {
        if (this.logLevel.getLevel() <= severity.getLevel()) {
            writeMessage(msg);
        }
        if (this.nextLogger != null) {
            this.nextLogger.log(severity, msg);
        }
    }

    protected abstract void writeMessage(String msg);

}
