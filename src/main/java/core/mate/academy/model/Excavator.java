package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfDipper;
    private int volumeOfDipper;

    public Excavator() {
    }

    public String getTypeOfDipper() {
        return typeOfDipper;
    }

    public void setTypeOfDipper(String typeOfDipper) {
        this.typeOfDipper = typeOfDipper;
    }

    public int getVolumeOfDipper() {
        return volumeOfDipper;
    }

    public void setVolumeOfDipper(int volumeOfDipper) {
        this.volumeOfDipper = volumeOfDipper;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
