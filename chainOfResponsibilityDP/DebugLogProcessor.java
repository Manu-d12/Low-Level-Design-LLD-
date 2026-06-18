package chainOfResponsibilityDP;

public class DebugLogProcessor extends LogProcessor {
    
    public DebugLogProcessor() {
        this.level = LogProcessor.DEBUG;
    }

    @Override
    public void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
