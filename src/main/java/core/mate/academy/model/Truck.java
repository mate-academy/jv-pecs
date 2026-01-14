package core.mate.academy.model;

public class Truck extends Machine {
    private int engineCapacity;
    private int payloadCapacity;

    public Truck() {
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
