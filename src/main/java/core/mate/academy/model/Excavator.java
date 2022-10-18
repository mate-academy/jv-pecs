package core.mate.academy.model;

public class Excavator extends Machine {
    private String type;

    public Excavator() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
