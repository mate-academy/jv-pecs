package core.mate.academy.model;

public class Truck extends Machine {
    private int enginePower;
    private int driverCount;

    public Truck() {
    }

    public Truck(String name, String color, int enginePower, int driverCount) {
        this.setName(name);
        this.setColor(color);
        this.enginePower = enginePower;
        this.driverCount = driverCount;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getDriverCount() {
        return driverCount;
    }

    public void setDriverCount(int driverCount) {
        this.driverCount = driverCount;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + "Name= " + this.getName()
                + ", color= " + this.getColor()
                + ", enginePower=" + enginePower
                + ", driverCount=" + driverCount
                + '}';
    }
}
