package core.mate.academy.model;

public class Truck extends Machine {
    private String liftingCapacity;
    private String power;
    private String cargoCompartment;

    public Truck() {
    }

    public String getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(String liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCargoCompartment() {
        return cargoCompartment;
    }

    public void setCargoCompartment(String cargoCompartment) {
        this.cargoCompartment = cargoCompartment;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
