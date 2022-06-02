package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int trackLength;

    public Bulldozer() {
    }

    public Bulldozer(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
