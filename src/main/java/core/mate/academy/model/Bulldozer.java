package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerType;
    private int weight;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
