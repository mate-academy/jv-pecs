package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bucketVolume;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bucketVolume) {
        super(name, color);
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
