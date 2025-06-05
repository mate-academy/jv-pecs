package core.mate.academy.model;

public class Excavator extends Machine {
    private int year;
    private String country;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
