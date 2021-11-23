package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int flywheelPower; //kW
    private double bucketCapacity; //m3
    private int maxDrawbarPull; //kN
    private int id;

    public Excavator() {
    }

    public int getFlywheelPower() {
        return flywheelPower;
    }

    public void setFlywheelPower(int flywheelPower) {
        this.flywheelPower = flywheelPower;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getMaxDrawbarPull() {
        return maxDrawbarPull;
    }

    public void setMaxDrawbarPull(int maxDrawbarPull) {
        this.maxDrawbarPull = maxDrawbarPull;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + id + " started to work");
    }
}
