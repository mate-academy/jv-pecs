package core.mate.academy.model;

public class Truck extends Machine {
    private boolean offroadCapable;
    private int wheelSize;

    public Truck() {
    }

    public void setOffroadCapable(boolean offroadCapable) {
        this.offroadCapable = offroadCapable;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
