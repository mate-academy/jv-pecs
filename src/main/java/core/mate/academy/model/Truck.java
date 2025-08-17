package core.mate.academy.model;

public class Truck extends Machine {
    private String cargoCompartmentLength;
    private String cargoCompartmentWidth;
    private String cargoCompartmentVolume;

    public Truck() {
    }

    public Truck(String cargoCompartmentLength, String cargoCompartmentWidth,
                 String cargoCompartmentVolume) {
        this.cargoCompartmentLength = cargoCompartmentLength;
        this.cargoCompartmentWidth = cargoCompartmentWidth;
        this.cargoCompartmentVolume = cargoCompartmentVolume;
    }

    public String getCargoCompartmentLength() {
        return cargoCompartmentLength;
    }

    public String getCargoCompartmentWidth() {
        return cargoCompartmentWidth;
    }

    public String getCargoCompartmentVolume() {
        return cargoCompartmentVolume;
    }

    public void setCargoCompartmentLength(String cargoCompartmentLength) {
        this.cargoCompartmentLength = cargoCompartmentLength;
    }

    public void setCargoCompartmentWidth(String cargoCompartmentWidth) {
        this.cargoCompartmentWidth = cargoCompartmentWidth;
    }

    public void setCargoCompartmentVolume(String cargoCompartmentVolume) {
        this.cargoCompartmentVolume = cargoCompartmentVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
