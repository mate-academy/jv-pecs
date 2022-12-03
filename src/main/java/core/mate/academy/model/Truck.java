package core.mate.academy.model;

public class Truck extends Machine {
    private int truckIntField;
    private String truckStrField;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTruckIntField() {
        return truckIntField;
    }

    public void setTruckIntField(int truckIntField) {
        this.truckIntField = truckIntField;
    }

    public String getTruckStrField() {
        return truckStrField;
    }

    public void setTruckStrField(String truckStrField) {
        this.truckStrField = truckStrField;
    }
}
