package core.mate.academy.model;

public class Bulldozer extends Machine {
    private Integer weight;

    public Bulldozer() {
    }

    public Bulldozer(Integer weight, String name, String color) {
        super(name, color);
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
