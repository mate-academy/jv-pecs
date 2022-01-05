package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private Double bladeArea;
    private String typeOfBlade;

    public Bulldozer() {
    }

    public Double getBladeArea() {
        return bladeArea;
    }

    public void setBladeArea(Double bladeArea) {
        this.bladeArea = bladeArea;
    }

    public String getTypeOfBlade() {
        return typeOfBlade;
    }

    public void setTypeOfBlade(String typeOfBlade) {
        this.typeOfBlade = typeOfBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public void bucketVolume(double v) {

    }

    @Override
    public void setLoadCapacity(int i) {

    }
}
