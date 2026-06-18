package chainOfResponsibilityDP;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor() {
        this.level = LogProcessor.INFO;
    }
    
    @Override
    public void write(String message) {
        System.out.println("INFO: " + message);
    }
}
