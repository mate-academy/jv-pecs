package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int weight;
    private int enginePower;

    public Bulldozer() {
    }

    public Bulldozer(int weight, int enginePower, String name, String color) {
        this.weight = weight;
        this.enginePower = enginePower;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
