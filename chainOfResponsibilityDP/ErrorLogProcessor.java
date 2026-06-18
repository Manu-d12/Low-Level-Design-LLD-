package chainOfResponsibilityDP;

public class ErrorLogProcessor extends LogProcessor {
    
    public ErrorLogProcessor() {
        this.level = LogProcessor.ERROR;
    }

    @Override
    public void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
