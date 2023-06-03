package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfExcavator;
    private int weightOfExcavator;
    private int capacityOfExcavator;
    public Excavator(String typeOfExcavator, int weightOfExcavator, int capacityOfExcavator) {
        this.typeOfExcavator = typeOfExcavator;
        this.weightOfExcavator = weightOfExcavator;
        this.capacityOfExcavator = capacityOfExcavator;
    }

    public String getTypeOfExcavator() {
        return typeOfExcavator;
    }

    public void setTypeOfExcavator(String typeOfExcavator) {
        this.typeOfExcavator = typeOfExcavator;
    }

    public int getWeightOfExcavator() {
        return weightOfExcavator;
    }

    public void setWeightOfExcavator(int weightOfExcavator) {
        this.weightOfExcavator = weightOfExcavator;
    }

    public int getCapacityOfExcavator() {
        return capacityOfExcavator;
    }

    public void setCapacityOfExcavator(int capacityOfExcavator) {
        this.capacityOfExcavator = capacityOfExcavator;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
