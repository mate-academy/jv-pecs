package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private Integer maxCargoCapacity;
    private String maker;

    public Truck() {
    }

    public Truck(Integer maxCargoCapacity, String maker) {
        this.maxCargoCapacity = maxCargoCapacity;
        this.maker = maker;
    }

    public Integer getMaxCargoCapacity() {
        return maxCargoCapacity;
    }

    public void setMaxCargoCapacity(Integer maxCargoCapacity) {
        this.maxCargoCapacity = maxCargoCapacity;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
