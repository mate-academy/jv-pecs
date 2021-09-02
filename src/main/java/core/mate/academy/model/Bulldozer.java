package core.mate.academy.model;
public class Bulldozer extends Machine {
    private String bladeType;
    private int bladeLength;
    private int bladeWeight;
    public Bulldozer() {
    }
    public Bulldozer(String bladeType, int bladeLength, int bladeWeight) {
        this.bladeType = bladeType;
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
