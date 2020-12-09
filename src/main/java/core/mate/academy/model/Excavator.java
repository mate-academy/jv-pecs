package core.mate.academy.model;

public class Excavator extends Machine {
    private String model;
    private int yearOfProduction;

    public Excavator() {

    }

    public Excavator(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
