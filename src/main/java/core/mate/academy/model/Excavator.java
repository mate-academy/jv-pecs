package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String producer;
    private int accumulation;
    private String typeOfFuel;

    public Excavator() {
    }

    public Excavator(String producer, int accumulation, String typeOfFuel) {
        this.producer = producer;
        this.accumulation = accumulation;
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getAccumulation() {
        return accumulation;
    }

    public void setAccumulation(int accumulation) {
        this.accumulation = accumulation;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
