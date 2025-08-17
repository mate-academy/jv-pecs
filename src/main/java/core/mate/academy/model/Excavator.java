package core.mate.academy.model;

public class Excavator extends Machine {
    private String model;

    public Excavator() {
    }

    public Excavator(String name, String color, String model) {
        super(name, color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
