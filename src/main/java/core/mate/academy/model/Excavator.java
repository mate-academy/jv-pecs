package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketVolume) {
        super(name, color);
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
