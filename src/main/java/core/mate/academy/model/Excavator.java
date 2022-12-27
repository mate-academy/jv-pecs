package core.mate.academy.model;

public class Excavator extends Machine {
    private double maximumDigDepth;
    private int horsePower;
    private int fuelTankCapacity;

    public Excavator() {
    }

    public Excavator(double maximumDigDepth, int horsePower, int fuelTankCapacity) {
        this.maximumDigDepth = maximumDigDepth;
        this.horsePower = horsePower;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public double getMaximumDigDepth() {
        return maximumDigDepth;
    }

    public void setMaximumDigDepth(double maximumDigDepth) {
        this.maximumDigDepth = maximumDigDepth;
    }

    public int getNetPower() {
        return horsePower;
    }

    public void setNetPower(int netPower) {
        this.horsePower = netPower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }
}
