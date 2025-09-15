package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String make;
    private String model;
    private String cargoTrailer;

    public Truck() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCargoTrailer() {
        return cargoTrailer;
    }

    public void setCargoTrailer(String cargoTrailer) {
        this.cargoTrailer = cargoTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
