package core.mate.academy.model;

public class Excavator extends Machine {
    private String country;

    public Excavator() {
    }

    public Excavator(String name, String color, String country) {
        super(name, color);
        this.country = country;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
