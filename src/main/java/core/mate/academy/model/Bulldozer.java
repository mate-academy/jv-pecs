package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsepower;
    private double weight;
    private double fuelLevel;

    public Bulldozer() {
        super("Default name", "Default color");
    }

    public Bulldozer(String name, String color, int horsepower, double weight, double fuelLevel) {
        super(name, color);
        this.horsepower = horsepower;
        this.weight = weight;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

}
