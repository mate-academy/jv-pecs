package core.mate.academy.model;

public class Truck extends Machine {
    private double topSped;
    private double cargoWeightInKg;
    private String trailerType;

    public Truck(String name, String color, double topSped,
            double cargoWeightInKg, String trailerType) {
        super(name, color);
        this.topSped = topSped;
        this.cargoWeightInKg = cargoWeightInKg;
        this.trailerType = trailerType;
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    public Truck() {
    }

    public double getTopSped() {
        return topSped;
    }

    public void setTopSped(double topSped) {
        this.topSped = topSped;
    }

    public double getCargoWeightInKg() {
        return cargoWeightInKg;
    }

    public void setCargoWeightInKg(double cargoWeightInKg) {
        this.cargoWeightInKg = cargoWeightInKg;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
