package cz.codecamp.logger.loggers;

import cz.codecamp.logger.LogLevelEnum;
import cz.codecamp.logger.LoggerInterface;

public class StdoutLogger implements LoggerInterface {

    @Override
    public void log(LogLevelEnum level, String message) {
        System.out.printf("[%s]: %s\n", level.name(), message);
    }

}
