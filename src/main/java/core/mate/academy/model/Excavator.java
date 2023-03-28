package core.mate.academy.model;

public class Excavator extends Machine {
    private String model;
    private int horsePower;
    private int yearOfManufacture;
    private double weight;

    public Excavator() {
    }

    public Excavator(String model, int horsePower,
                     int yearOfManufacture, double weight) {
        this.model = model;
        this.horsePower = horsePower;
        this.yearOfManufacture = yearOfManufacture;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
