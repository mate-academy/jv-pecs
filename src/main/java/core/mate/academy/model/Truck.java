package core.mate.academy.model;

public class Truck extends Machine {
    private String truckCustomString;
    private int truckCustomInt;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getTruckCustomString() {
        return truckCustomString;
    }

    public void setTruckCustomString(String truckCustomString) {
        this.truckCustomString = truckCustomString;
    }

    public int getTruckCustomInt() {
        return truckCustomInt;
    }

    public void setTruckCustomInt(int truckCustomInt) {
        this.truckCustomInt = truckCustomInt;
    }
}
