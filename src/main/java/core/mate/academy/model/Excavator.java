package core.mate.academy.model;

public class Excavator extends Machine {
    private int fuelPerHour;
    private int weight;

    public Excavator() {
    }

    public Excavator(int fuelPerHour, int weight) {
        this.fuelPerHour = fuelPerHour;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
