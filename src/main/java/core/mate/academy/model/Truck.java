package core.mate.academy.model;

public class Truck extends Machine {
    private int truckInt;
    private String truckStr;
    private boolean truckBool;

    public Truck() {

    }

    public Truck(int truckInt, String truckStr, boolean truckBool) {
        this.truckInt = truckInt;
        this.truckStr = truckStr;
        this.truckBool = truckBool;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
