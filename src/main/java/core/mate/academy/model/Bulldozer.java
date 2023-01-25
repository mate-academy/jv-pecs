package core.mate.academy.model;

public class Bulldozer extends Machine {
    private Double bucketCargoWeight;

    public Bulldozer(Double bucketCargoWeight, String setName, String setColor) {
        this.bucketCargoWeight = bucketCargoWeight;
        super.setName(setName);
        super.setColor(setColor);
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
