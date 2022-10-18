package core.mate.academy.model;

public class Excavator extends Machine {
    private String type;

    public Excavator() {
        this.type = "Excavator";
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
