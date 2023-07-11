package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int scoopLength;

    public Excavator() {
    }

    public Excavator(int scoopLength, String name) {
        this.scoopLength = scoopLength;
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator goes scooping");
    }
}
