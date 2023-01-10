package core.mate.academy.model;

public class Truck extends Machine {
    private String cargoName;
    private int lenghtTruck;

    public Truck() {

    }

    public Truck(String cargoName, int lenghtTruck) {
        this.lenghtTruck = lenghtTruck;
        this.cargoName = cargoName;
    }

    public String getCargoName() {
        return cargoName;
    }

    public int getLenghtTruck() {
        return lenghtTruck;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public void setLenghtTruck(int lenghtTruck) {
        this.lenghtTruck = lenghtTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
