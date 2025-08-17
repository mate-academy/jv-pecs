package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double fuelConsumption;
    private String typeOfTransmission;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double fuelConsumption, String typeOfTransmission) {
        super.setName(name);
        super.setColor(color);
        this.fuelConsumption = fuelConsumption;
        this.typeOfTransmission = typeOfTransmission;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
