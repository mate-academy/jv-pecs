package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int grabCapacity;
    private String producerCountry;

    public Excavator() {
    }

    public int getGrabCapacity() {
        return grabCapacity;
    }

    public void setGrabCapacity(int grabCapacity) {
        this.grabCapacity = grabCapacity;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
