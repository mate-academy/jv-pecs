package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String manufacturer;
    private int year;
    private double fuelConsumption;

    public Bulldozer() {
    }

    public Bulldozer(String manufacturer, int year, double fuelConsumption) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
