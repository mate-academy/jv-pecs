package core.mate.academy.model;

public class Excavator extends Machine {
    private String wheelsOrTracks;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
