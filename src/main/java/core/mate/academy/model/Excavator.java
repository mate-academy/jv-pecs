package core.mate.academy.model;

public class Excavator extends Machine {
    private int power;
    private int numberOfBuckets;

    public Excavator() {
    }

    public Excavator(String name, String color, int power, int numberOfBuckets) {
        super(name,color);
        this.power = power;
        this.numberOfBuckets = numberOfBuckets;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
