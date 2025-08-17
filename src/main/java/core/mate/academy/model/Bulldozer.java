package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bulldozerPower;

    public Bulldozer() {
    }

    public Bulldozer(int bulldozerPower) {
        this.bulldozerPower = bulldozerPower;
    }

    public int getBulldozerPower() {
        return bulldozerPower;
    }

    public void setBulldozerPower(int bulldozerPower) {
        this.bulldozerPower = bulldozerPower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
