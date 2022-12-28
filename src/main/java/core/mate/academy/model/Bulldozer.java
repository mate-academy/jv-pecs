package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String trackFrame;
    private int sizeOfBlade;
    private boolean isRipper;

    public Bulldozer(String trackFrame, int sizeOfBlade, boolean isRipper) {
        this.trackFrame = trackFrame;
        this.sizeOfBlade = sizeOfBlade;
        this.isRipper = isRipper;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
