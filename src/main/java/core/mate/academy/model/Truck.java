package core.mate.academy.model;

public class Truck extends Machine {
    private String model;

    public Truck() {
    }

    public Truck(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
