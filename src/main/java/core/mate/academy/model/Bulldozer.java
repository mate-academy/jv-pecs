package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int weight;
    private String fuel;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int weight, String fuel) {
        setNameColor(name, color);
        this.weight = weight;
        this.fuel = fuel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
