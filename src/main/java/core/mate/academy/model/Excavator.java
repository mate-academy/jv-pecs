package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private String chassisType;
    private String dutyCycle;

    public Excavator() {
    }

    public Excavator(int bucketCapacity, String chassisType, String dutyCycle) {
        this.bucketCapacity = bucketCapacity;
        this.chassisType = chassisType;
        this.dutyCycle = dutyCycle;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
