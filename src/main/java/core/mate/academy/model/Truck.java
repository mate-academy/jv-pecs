package core.mate.academy.model;

public class Truck extends Machine {
    private String bodyType;
    private int serialNumOfTank;
    private int tankCapacity;

    public Truck() {
    }

    public Truck(String bodyType, int serialNumOfTank, int tankCapacity) {
        this.bodyType = bodyType;
        this.serialNumOfTank = serialNumOfTank;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
