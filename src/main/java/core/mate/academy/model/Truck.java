package core.mate.academy.model;

public class Truck extends Machine {
    private Integer tires;
    private Double payloadCapacity;

    public Truck() {
    }

    public Truck(String name, String color, Integer tires, Double payloadCapacity) {
        super(name, color);
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
