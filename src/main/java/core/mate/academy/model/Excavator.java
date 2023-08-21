package core.mate.academy.model;

public class Excavator extends Machine {
    private int weightExcavator;
    private String typeWheelMover;

    public Excavator(int weightExcavator, String typeWheelMover) {
        this.weightExcavator = weightExcavator;
        this.typeWheelMover = typeWheelMover;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
