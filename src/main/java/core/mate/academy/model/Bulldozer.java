package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeOfBuldozer;

    public String getTypeOfBuldozer() {
        return typeOfBuldozer;
    }

    public void setTypeOfBuldozer(String typeOfBuldozer) {
        this.typeOfBuldozer = typeOfBuldozer;
    }

    public int getWeightOfBuldozer() {
        return weightOfBuldozer;
    }

    public void setWeightOfBuldozer(int weightOfBuldozer) {
        this.weightOfBuldozer = weightOfBuldozer;
    }

    public int getCapacityOfBuldozer() {
        return capacityOfBuldozer;
    }

    public void setCapacityOfBuldozer(int capacityOfBuldozer) {
        this.capacityOfBuldozer = capacityOfBuldozer;
    }

    private int weightOfBuldozer;
    private int capacityOfBuldozer;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
