package core.mate.academy.model;

public class Truck extends Machine {
    private String bodyType; // on-board, van, tractor
    private String volumeOfTruck; // small tonnage, medium tonnage, large tonnage

    public Truck(String name, String color, String bodyType, String volumeOfTruck) {
        super(name, color);
        this.bodyType = bodyType;
        this.volumeOfTruck = volumeOfTruck;
    }

    public Truck() {
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getVolumeOfTruck() {
        return volumeOfTruck;
    }

    public void setVolumeOfTruck(String volumeOfTruck) {
        this.volumeOfTruck = volumeOfTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
