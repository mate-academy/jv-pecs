package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int numOfSeats;
    private int enginePower;

    public Bulldozer(int numOfSeats, int enginePower) {
        this.numOfSeats = numOfSeats;
        this.enginePower = enginePower;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
