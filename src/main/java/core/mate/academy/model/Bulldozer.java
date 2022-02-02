package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String model;
    private String color;
    private int energy;

    public Bulldozer() {
    }

    public Bulldozer(String model, String color, int energy) {
        this.model = model;
        this.color = color;
        this.energy = energy;
    }

    public String getName() {
        return this.model;
    }

    public void setModel() {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
