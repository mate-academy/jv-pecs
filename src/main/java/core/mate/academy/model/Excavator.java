package core.mate.academy.model;

public class Excavator extends Machine {
    private double scoopVolume;

    public Excavator() {
    }

    public Excavator(double scoopVolume) {
        this.scoopVolume = scoopVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
