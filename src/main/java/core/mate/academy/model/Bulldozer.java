package core.mate.academy.model;

public class Bulldozer extends Machine {
    private Double bucketCargoWeight;

    public Bulldozer(Double bucketCargoWeight, String name, String color) {
        super(name, color);
        this.bucketCargoWeight = bucketCargoWeight;
    }

    public Bulldozer()  {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
