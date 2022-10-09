package core.mate.academy.model;

public class Excavator extends Machine {
    private int enginePower;
    private int weight;

    public Excavator(int enginePower, int weight) {
        this.enginePower = enginePower;
        this.weight = weight;
    }

    public Excavator() {
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
