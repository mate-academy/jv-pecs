package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private Integer tires;
    private Double payloadCapacity;

    public Truck() {
    }

    public Truck(Integer tires, Double payloadCapacity) {
        this.tires = tires;
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public Integer getTires() {
        return tires;
    }

    public void setTires(Integer tires) {
        this.tires = tires;
    }

    public Double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(Double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }
}
