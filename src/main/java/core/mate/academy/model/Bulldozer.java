package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladePower;

    public Bulldozer() {
    }

    public Bulldozer(double bladePower) {
        this.bladePower = bladePower;
    }

    public double getBladePower() {
        return bladePower;
    }

    public void setBladePower(double bladePower) {
        this.bladePower = bladePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
