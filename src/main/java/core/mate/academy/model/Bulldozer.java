package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String varietyOfBulldozer;
    private int powerOfEngine;
    private int qtyOfWheels;

    public Bulldozer() {
    }

    public Bulldozer(String varietyOfBulldozer, int powerOfEngine, int qtyOfWheels) {
        this.varietyOfBulldozer = varietyOfBulldozer;
        this.powerOfEngine = powerOfEngine;
        this.qtyOfWheels = qtyOfWheels;
    }

    public String getVarietyOfBulldozer() {
        return varietyOfBulldozer;
    }

    public void setVarietyOfBulldozer(String varietyOfBulldozer) {
        this.varietyOfBulldozer = varietyOfBulldozer;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }

    public int getQtyOfWheels() {
        return qtyOfWheels;
    }

    public void setQtyOfWheels(int qtyOfWheels) {
        this.qtyOfWheels = qtyOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
