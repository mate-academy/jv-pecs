package core.mate.academy.model;

public class Excavator extends Machine {
    private String color;

    public Excavator(String color) {
        this.color = color;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
