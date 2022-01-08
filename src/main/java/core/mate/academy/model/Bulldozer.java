package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private double bladeWidth;
    private double bladeHeight;
    private String transmissionType;
    private String suspension;

    public Bulldozer() {
    }

    public Bulldozer(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public double getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(double bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }
}
