package core.mate.academy.model;

public class Excavator extends Machine {
    private String make;
    private String model;
    private int year;

    public Excavator(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Excavator() {
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
