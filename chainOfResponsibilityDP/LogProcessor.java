package chainOfResponsibilityDP;

public abstract class LogProcessor {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;

    int level;
    LogProcessor nextLogProcessor;

    public void setNextLogProcessor(LogProcessor processor) {
        this.nextLogProcessor = processor;
    }

    public void logMessage(int level, String message) {
        if(this.level == level) {
            write(message);
        }
        if(this.nextLogProcessor != null) this.nextLogProcessor.logMessage(level, message);
    }

    public abstract void write(String message);
}
