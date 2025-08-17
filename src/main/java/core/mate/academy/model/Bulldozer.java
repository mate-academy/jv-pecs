package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int enginePower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int enginePower) {
        super(name, color);
        this.enginePower = enginePower;
    }

    public int getHeight() {
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
