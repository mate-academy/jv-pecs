package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;
    private int axleCount;
    private boolean hasTrailer;
    private String cargoType;
    
    public Truck() {
    }
    
    public Truck(double loadCapacity, int axleCount, boolean hasTrailer, String cargoType) {
        this.loadCapacity = loadCapacity;
        this.axleCount = axleCount;
        this.hasTrailer = hasTrailer;
        this.cargoType = cargoType;
    }
    
    public double getLoadCapacity() {
        return loadCapacity;
    }
    
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    public int getAxleCount() {
        return axleCount;
    }
    
    public void setAxleCount(int axleCount) {
        this.axleCount = axleCount;
    }
    
    public boolean hasTrailer() {
        return hasTrailer;
    }
    
    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
    
    public String getCargoType() {
        return cargoType;
    }
    
    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
