package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerType;
    private int weight;

    public Bulldozer(String name, String color, String bulldozerType, int weight) {
        super(name, color);
        this.bulldozerType = bulldozerType;
        this.weight = weight;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
