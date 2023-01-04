package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bucketVolume;
    private String typeСhassis;
    private int weightMachine;

    public Bulldozer() {
    }

    public Bulldozer(int bucketVolume, String typeСhassis, int weightMachine) {
        this.bucketVolume = bucketVolume;
        this.typeСhassis = typeСhassis;
        this.weightMachine = weightMachine;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
