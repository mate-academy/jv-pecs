package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String appointment;

    public Bulldozer(String name, String color, String appointment) {
        super(name, color);
        this.appointment = appointment;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
