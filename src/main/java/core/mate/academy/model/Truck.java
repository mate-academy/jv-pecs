package core.mate.academy.model;

public class Truck extends Machine {
    private String wheels;

    public Truck() {
    }

    public Truck(String wheels) {
        this.wheels = wheels;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
