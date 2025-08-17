package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int wheelsNumber;

    public Bulldozer() {
    }

    public Bulldozer(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
