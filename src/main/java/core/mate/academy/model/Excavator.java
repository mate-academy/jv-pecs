package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String producer;

    public Excavator() {
    }

    public Excavator(String name, String color, String producer) {
        super(name, color);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
