package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int wheelPairCount;
    private int canTransportGoods;

    public Truck() {
    }

    public Truck(String name, String color, int wheelPairCount, int canTransportGoods) {
        super(name, color);
        this.wheelPairCount = wheelPairCount;
        this.canTransportGoods = canTransportGoods;
    }

    public int getWheelPairCount() {
        return wheelPairCount;
    }

    public void setWheelPairCount(int wheelPairCount) {
        this.wheelPairCount = wheelPairCount;
    }

    public int getCanTransportGoods() {
        return canTransportGoods;
    }

    public void setCanTransportGoods(int canTransportGoods) {
        this.canTransportGoods = canTransportGoods;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
