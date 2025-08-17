package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int ladleVolume;

    public Excavator() {
    }

    public int getLadleVolume() {
        return ladleVolume;
    }

    public void setLadleVolume(int ladleVolume) {
        this.ladleVolume = ladleVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
