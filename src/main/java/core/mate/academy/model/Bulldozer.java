package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int enginePower;
    private double weight;
    private int horsePowers;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int enginePower, double weight, int horsePowers) {
        setName(name);
        setColor(color);
        this.enginePower = enginePower;
        this.weight = weight;
        this.horsePowers = horsePowers;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
