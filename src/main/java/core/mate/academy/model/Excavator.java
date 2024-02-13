package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketVolume;
    private int height;

    public Excavator() {
    }

    public Excavator(int bucketVolume, int height, String name, String color) {
        this.bucketVolume = bucketVolume;
        this.height = height;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
