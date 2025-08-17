package core.mate.academy.model;

public class Excavator extends Machine {
    private Double ladleCargoWeight;

    public Excavator(Double ladleCargoWeight, String name, String color) {
        super(name, color);
        this.ladleCargoWeight = ladleCargoWeight;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
