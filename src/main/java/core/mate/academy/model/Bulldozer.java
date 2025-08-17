package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int loadCarryDistance;

    public Bulldozer() {
    }

    public Bulldozer(int loadCarryDistance) {
        this.loadCarryDistance = loadCarryDistance;
    }

    public int getLoadCarryDistance() {
        return loadCarryDistance;
    }

    public void setLoadCarryDistance(int loadCarryDistance) {
        this.loadCarryDistance = loadCarryDistance;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
