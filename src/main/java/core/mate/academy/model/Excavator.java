package core.mate.academy.model;

public class Excavator extends Machine {
    private int maxMass;

    public Excavator() {
    }

    public Excavator(int maxMass) {
        this.maxMass = maxMass;
    }

    public int getMaxMass() {
        return maxMass;
    }

    public void setMaxMass(int maxMass) {
        this.maxMass = maxMass;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
