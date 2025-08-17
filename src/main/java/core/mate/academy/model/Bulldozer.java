package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int yearOfManufacture;
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int yearOfManufacture, int weight) {
        super(name,color);
        this.yearOfManufacture = yearOfManufacture;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
