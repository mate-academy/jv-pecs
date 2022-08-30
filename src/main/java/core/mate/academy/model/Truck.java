package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int platformArea;
    private String suspension;
    private String cabin;

    public Truck() {
    }

    public Truck(String name, String color, int platformArea, String suspension, String cabin) {
        super(name, color);
        this.platformArea = platformArea;
        this.suspension = suspension;
        this.cabin = cabin;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getPlatformArea() {
        return platformArea;
    }

    public void setPlatformArea(int platformArea) {
        this.platformArea = platformArea;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }
}
