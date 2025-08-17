package core.mate.academy.model;

public class Excavator extends Machine {
    private String type;
    private int armLength;
    private int bucketVolume;
    private int maximumSwingSpeed;
    private int machineWeight;

    public Excavator(String type, int armLength, int bucketVolume,int maximumSwingSpeed,
                     int machineWeight, String name, String color) {
        super(name, color);
        this.type = type;
        this.armLength = armLength;
        this.bucketVolume = bucketVolume;
        this.maximumSwingSpeed = maximumSwingSpeed;
        this.machineWeight = machineWeight;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
