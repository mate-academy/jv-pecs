package core.mate.academy.model;

public class Excavator extends Machine {
    private final String excavatorModel;
    private final int yearOfProduction;

    public Excavator() {
        this.excavatorModel = "Model One";
        this.yearOfProduction = 1970;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
