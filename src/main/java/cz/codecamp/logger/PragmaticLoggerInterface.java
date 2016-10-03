package cz.codecamp.logger;

public interface PragmaticLoggerInterface extends LoggerInterface {
    void debug(String message);
    void info(String message);
    void warning(String message);
    void error(String message);
}
