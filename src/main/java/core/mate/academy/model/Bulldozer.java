package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int weight) {
        super(name, color);
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
