package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorLength;
    private String serialNum;

    public Excavator() {
    }

    public Excavator(String serialNum, int excavatorLength) {
        this.excavatorLength = excavatorLength;
        this.serialNum = serialNum;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
