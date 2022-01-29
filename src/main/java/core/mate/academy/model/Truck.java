package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String bodyType;
    private int volumeOfLoadSpace;

    public Truck() {
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getVolumeOfLoadSpace() {
        return volumeOfLoadSpace;
    }

    public void setVolumeOfLoadSpace(int volumeOfLoadSpace) {
        this.volumeOfLoadSpace = volumeOfLoadSpace;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
