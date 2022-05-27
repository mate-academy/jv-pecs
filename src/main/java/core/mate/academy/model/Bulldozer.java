package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int scoopSize;
    private int maxSpeed;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int scoopSize, int maxSpeed) {
        super(name, color);
        this.scoopSize = scoopSize;
        this.maxSpeed = maxSpeed;
    }

    public int getScoopSize() {
        return scoopSize;
    }

    public void setScoopSize(int scoopSize) {
        this.scoopSize = scoopSize;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
