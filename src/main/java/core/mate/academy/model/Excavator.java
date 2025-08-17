package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;
    private String name;
    private String color;

    public Excavator() {
    }

    public Excavator(String name, String color, double bucketVolume) {
        this.name = name;
        this.color = color;
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
