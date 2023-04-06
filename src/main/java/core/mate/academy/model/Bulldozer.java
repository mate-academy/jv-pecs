package core.mate.academy.model;

public class Bulldozer extends Machine {
    private Integer weighBlade;
    private String typeTracks;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
