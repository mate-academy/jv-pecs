package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double sizeKnife;
    private String name;
    private String color;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double sizeKnife) {
        this.name = name;
        this.color = color;
        this.sizeKnife = sizeKnife;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
