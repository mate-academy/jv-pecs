package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double weight;
    private String producer;

    public Excavator() {
    }

    public Excavator(double weight, String producer) {
        this.weight = weight;
        this.producer = producer;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
