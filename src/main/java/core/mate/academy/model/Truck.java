package core.mate.academy.model;

public class Truck extends Machine {
    private String driverQualification;

    public Truck() {
    }

    public String getDriverQualification() {
        return driverQualification;
    }

    public void setDriverQualification(String driverQualification) {
        this.driverQualification = driverQualification;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
