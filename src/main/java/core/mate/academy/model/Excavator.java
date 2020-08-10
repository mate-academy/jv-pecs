package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String producer;
    private int maxDiggingDepth;

    public Excavator() {
    }

    public Excavator(String producer, int maxDiggingDepth) {
        this.producer = producer;
        this.maxDiggingDepth = maxDiggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}

