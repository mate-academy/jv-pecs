package core.mate.academy.model;

public class Truck extends Machine {
    private int payloadCapacity;
    private String truckType;

    public Truck() {
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
