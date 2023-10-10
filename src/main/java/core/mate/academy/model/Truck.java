package core.mate.academy.model;

public class Truck extends Machine {
    private String bodyType;
    private String cargoType;
    private double payload;

    public Truck() {
    }

    public Truck(String bodyType, String cargoType, double payload) {
        this.bodyType = bodyType;
        this.cargoType = cargoType;
        this.payload = payload;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}
