package core.mate.academy.model;

public class Truck extends Machine {
    private int maxWeightVelocity;

    public Truck() {
    }

    public Truck(String name, String color,int maxWeightVelocity) {
        this.setName(name);
        this.setColor(color);
        this.maxWeightVelocity = maxWeightVelocity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxWeight() {
        return maxWeightVelocity;
    }
}
