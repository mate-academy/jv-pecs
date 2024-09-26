package core.mate.academy.model;

public class Excavator extends Machine {
    private int yearOfProduction;

    public Excavator() {

    }

    public Excavator(String model, String name, String color, int yearOfProduction) {
        super(model, name, color);
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
