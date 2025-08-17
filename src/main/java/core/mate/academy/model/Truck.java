package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private double struckCapacity; //m3
    private double heapedCapacity; //m3
    private int maximumPayload; //kg
    private int id;

    public Truck() {
    }

    public double getStruckCapacity() {
        return struckCapacity;
    }

    public void setStruckCapacity(double struckCapacity) {
        this.struckCapacity = struckCapacity;
    }

    public double getHeapedCapacity() {
        return heapedCapacity;
    }

    public void setHeapedCapacity(double heapedCapacity) {
        this.heapedCapacity = heapedCapacity;
    }

    public int getMaximumPayload() {
        return maximumPayload;
    }

    public void setMaximumPayload(int maximumPayload) {
        this.maximumPayload = maximumPayload;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + id + " started to work");
    }
}
