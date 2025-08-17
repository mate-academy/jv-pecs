package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typesBySize;
    private int amountWheels;
    private boolean hasFridge;

    public Truck() {
        super();
    }

    public String getTypesBySize() {
        return typesBySize;
    }

    public void setTypesBySize(String typesBySize) {
        this.typesBySize = typesBySize;
    }

    public int getAmountWheels() {
        return amountWheels;
    }

    public void setAmountWheels(int amountWheels) {
        this.amountWheels = amountWheels;
    }

    public boolean isHasFridge() {
        return hasFridge;
    }

    public void setHasFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
