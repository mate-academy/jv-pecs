package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketVolume;
    private String typeСhassis;
    private int weightMachine;

    public Excavator() {
    }

    public Excavator(int bucketVolume, String typeСhassis, int weightMachine) {
        this.bucketVolume = bucketVolume;
        this.typeСhassis = typeСhassis;
        this.weightMachine = weightMachine;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
