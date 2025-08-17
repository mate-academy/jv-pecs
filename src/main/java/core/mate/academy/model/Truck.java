package core.mate.academy.model;

public class Truck extends Machine {
    private String truckModel;
    private int truckYear;

    public Truck(String model, int year) {
        this.truckModel = model;
        this.truckYear = year;
    }

    public Truck() {
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String model) {
        this.truckModel = model;
    }

    public int getTruckYear() {
        return truckYear;
    }

    public void setTruckYear(int year) {
        this.truckYear = year;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started do work");
    }
}
