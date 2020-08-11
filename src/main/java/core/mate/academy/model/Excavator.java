package core.mate.academy.model;

public class Excavator extends Machine {
    private String owner;
    private int mileage;

    public String getOwner() {
        return owner;
    }

    public int getMileage() {
        return mileage;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
