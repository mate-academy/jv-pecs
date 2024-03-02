package core.mate.academy.model;

public class Excavator extends Machine {
    private int year;
    private String power;
    private String model;

    public Excavator() {
    }

    public Excavator(int year, String power, String model) {
        this.year = year;
        this.power = power;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
