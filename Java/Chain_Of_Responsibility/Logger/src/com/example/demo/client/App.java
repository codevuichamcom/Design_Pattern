package com.example.demo.client;

import com.example.demo.enums.LogLevel;
import com.example.demo.handler.Logger;
import com.example.demo.utils.AppLogger;

public class App {
    public static void main(String[] args) throws Exception {
        // Build the chain of responsibility
        Logger logger = AppLogger.getLogger();

        // Handled by ConsoleLogger since the console has a LogLevel of DEBUG
        logger.log(LogLevel.INFO, "Info message");
        logger.log(LogLevel.DEBUG, "Debug message");

        // Handled by ConsoleLogger and FileLogger
        logger.log(LogLevel.ERROR, "Error message");

        // Handled by ConsoleLogger, FileLogger, EmailLogger
        logger.log(LogLevel.FATAL, "Factal message");
    }
}
