package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeLength;
    private int enginePower;
    private int weight;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(String bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
