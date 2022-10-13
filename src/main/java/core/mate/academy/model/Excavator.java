package core.mate.academy.model;

public class Excavator extends Machine {
    private int weight;

    public Excavator() {
    }

    public Excavator(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
