package org.home_work7.service;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LOGGER {
    public final static Logger logger =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static {
        try (FileInputStream in =
                     new FileInputStream("home_work7\\resources\\ logging.properties")) {
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addNote(String message) {
        logger.info(message);
    }
}
