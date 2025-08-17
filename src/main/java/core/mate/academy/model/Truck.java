package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String companyName;
    private int tankCapacity;

    public Truck() {
    }

    private Truck(String companyName, int tankCapacity) {
        this.companyName = companyName;
        this.tankCapacity = tankCapacity;
    }

    private String getCompanyName() {
        return companyName;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private int getTankCapacity() {
        return tankCapacity;
    }

    private void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
