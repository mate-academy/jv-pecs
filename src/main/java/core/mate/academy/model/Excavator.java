package core.mate.academy.model;

public class Excavator extends Machine {
    private String type;
    private String color;

    public Excavator(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Excavator() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
