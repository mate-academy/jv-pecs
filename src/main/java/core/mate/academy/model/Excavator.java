package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;
    private int diggingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, double bucketVolume, int diggingDepth) {
        super(name, color);
        this.bucketVolume = bucketVolume;
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
