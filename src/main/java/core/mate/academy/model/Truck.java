package core.mate.academy.model;

public class Truck extends Machine {
    private String model;
    private double speed;
    private double energy;

    public Truck() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
