package core.mate.academy.model;

public class Excavator extends Machine {
    private Double ladleCargoWeight;

    public Excavator(Double ladleCargoWeight, String setName, String setColor) {
        this.ladleCargoWeight = ladleCargoWeight;
        super.setName(setName);
        super.setColor(setColor);
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
