package core.mate.academy.model;

public class Truck extends Machine {
    private int maxPayload;

    public Truck() {
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
