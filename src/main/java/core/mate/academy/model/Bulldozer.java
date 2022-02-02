package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private int bladeLength;
    private int bladeWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color,
                     String bladeType, int bladeLength, int bladeWeight) {
        super(name, color);
        this.bladeType = bladeType;
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
