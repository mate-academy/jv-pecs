package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int enginePower;

    public Bulldozer() {
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
