package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String type;

    public Bulldozer() {
        this.type = "Bulldozer";
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
