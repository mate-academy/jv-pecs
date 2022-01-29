package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucketType;

    public Excavator(String bucketType) {
        this.bucketType = bucketType;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
