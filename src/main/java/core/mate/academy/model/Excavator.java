package core.mate.academy.model;

public class Excavator extends Machine {
    private String bedType;
    private int bedLength;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
