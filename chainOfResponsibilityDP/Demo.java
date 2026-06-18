package chainOfResponsibilityDP;

public class Demo {
    public static void main(String[] args) {
        LogProcessor logProcessor = getLogProcessorChain();
        logProcessor.logMessage(LogProcessor.INFO, "NullPointerException at Line 2882");
    }

    private static LogProcessor getLogProcessorChain() {
        LogProcessor debugLogProcessor = new DebugLogProcessor();
        LogProcessor infoLogProcessor = new InfoLogProcessor();
        LogProcessor errorProcessor = new ErrorLogProcessor();

        debugLogProcessor.setNextLogProcessor(infoLogProcessor);
        infoLogProcessor.setNextLogProcessor(errorProcessor);
        errorProcessor.setNextLogProcessor(null);

        return debugLogProcessor;
    }
}
