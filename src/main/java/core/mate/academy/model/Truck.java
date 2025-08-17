package core.mate.academy.model;

public class Truck extends Machine {
    private String type;

    public Truck() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
