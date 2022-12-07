package com.example.demo.utils;

import com.example.demo.enums.LogLevel;
import com.example.demo.handler.ConsoleLogger;
import com.example.demo.handler.EmailLogger;
import com.example.demo.handler.FileLogger;
import com.example.demo.handler.Logger;

public class AppLogger {

    public static Logger getLogger() {
        Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);
        Logger fileLogger = new FileLogger(LogLevel.ERROR);
        Logger emailLogger = new EmailLogger(LogLevel.FATAL);
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);
        return consoleLogger;
    }
}
