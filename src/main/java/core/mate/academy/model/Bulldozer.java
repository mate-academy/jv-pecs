package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int weight;
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
