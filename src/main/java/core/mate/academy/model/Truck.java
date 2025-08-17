package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int volumeMakeUp;
    private String engineBrand;

    public Truck() {
    }

    public int getVolumeMakeUp() {
        return volumeMakeUp;
    }

    public void setVolumeMakeUp(int volumeMakeUp) {
        this.volumeMakeUp = volumeMakeUp;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
