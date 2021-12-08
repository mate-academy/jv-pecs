package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String cab;
    private String frame;

    public Truck() {
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
