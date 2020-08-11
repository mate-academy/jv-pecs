package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double oilInSytem;
    private int numberOfBooms;
    private String typeOfBoom;
    private boolean isStationarable;

    public Excavator() {
    }

    public Excavator(double oilInSytem, int numberOfBooms,
                     String typeOfBoom, boolean isStationarable) {
        this.isStationarable = isStationarable;
        this.typeOfBoom = typeOfBoom;
        this.numberOfBooms = numberOfBooms;
        this.oilInSytem = oilInSytem;
    }

    public int getNumberOfBooms() {
        return numberOfBooms;
    }

    public void setNumberOfBooms(int numberOfBooms) {
        this.numberOfBooms = numberOfBooms;
    }

    public double get() {
        return oilInSytem;
    }

    public void setOilInSytem(double oilInSytem) {
        this.oilInSytem = oilInSytem;
    }

    public String getTypeOfBoom() {
        return typeOfBoom;
    }

    public void setTypeOfBoom(String typeOfBoom) {
        this.typeOfBoom = typeOfBoom;
    }

    public boolean isStationarable() {
        return isStationarable;
    }

    public void setStationarable(boolean stationarable) {
        isStationarable = stationarable;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
