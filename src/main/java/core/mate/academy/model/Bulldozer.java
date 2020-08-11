package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String frontTool;
    private String size;

    public Bulldozer() {
    }

    public Bulldozer(String frontTool, String size) {
        this.frontTool = frontTool;
        this.size = size;
    }

    public String getFrontTool() {
        return frontTool;
    }

    public void setFrontTool(String frontTool) {
        this.frontTool = frontTool;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
