package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String frontBlade;
    private String bulldozerType;

    public Bulldozer() {
    }

    public Bulldozer(String frontBlade, String bulldozerType) {
        this.bulldozerType = bulldozerType;
        this.frontBlade = frontBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
