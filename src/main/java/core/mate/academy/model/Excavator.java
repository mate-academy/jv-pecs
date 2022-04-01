package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeOfBucket;

    public Excavator() {
    }

    public Excavator(String typeOfBucket) {
        this.typeOfBucket = typeOfBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
