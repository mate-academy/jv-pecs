package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int numberOfTrucks;

    public Bulldozer(int numberOfTrucks) {
        this.numberOfTrucks = numberOfTrucks;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
