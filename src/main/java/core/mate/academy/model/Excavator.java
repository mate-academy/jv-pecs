package core.mate.academy.model;

public class Excavator extends Machine {
    private String reachRange;
    private String attachmentTool;

    public Excavator() {
    }

    public Excavator(String reachRange, String attachmentTool) {
        this.attachmentTool = attachmentTool;
        this.reachRange = reachRange;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
