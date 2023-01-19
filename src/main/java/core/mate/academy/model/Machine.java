package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;
    private double fuelVolume;

    public Machine() {

    }

    public Machine(String name, String color, double fuelVolume) {
        this.name = name;
        this.color = color;
        this.fuelVolume = fuelVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }
}
