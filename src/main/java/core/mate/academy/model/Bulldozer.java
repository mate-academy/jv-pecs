package core.mate.academy.model;

public class Bulldozer extends Machine {
    private BulldozerType type;

    public Bulldozer() {
        this.type = BulldozerType.HYBRID_BULLDOZER;
    }

    public Bulldozer(BulldozerType type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
