package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String type;
    private String typeOfTool;

    public Excavator() {
    }

    public Excavator(String type, String typeOfTool) {
        this.type = type;
        this.typeOfTool = typeOfTool;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeOfTool() {
        return typeOfTool;
    }

    public void setTypeOfTool(String typeOfTool) {
        this.typeOfTool = typeOfTool;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
