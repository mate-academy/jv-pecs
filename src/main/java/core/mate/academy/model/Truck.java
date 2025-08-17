package core.mate.academy.model;

public class Truck extends Machine {
    private int specialTruckField;

    public Truck() {
    }

    public void setSpecialTruckField(int specialTruckField) {
        this.specialTruckField = specialTruckField;
    }

    public int getSpecialTruckField() {
        return specialTruckField;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
