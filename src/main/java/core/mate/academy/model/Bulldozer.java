package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String primaryTool;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String primaryTool) {
        this.setName(name);
        this.setColor(color);
        this.primaryTool = primaryTool;
    }

    public String getPrimaryTool() {
        return primaryTool;
    }

    public void setPrimaryTool(String primaryTool) {
        this.primaryTool = primaryTool;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
