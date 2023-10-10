package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeLength;
    private double bladeMass;
    private double rockMovementDistance;

    public Bulldozer() {
    }

    public Bulldozer(double bladeLength, double bladeMass, double rockMovementDistance) {
        this.bladeLength = bladeLength;
        this.bladeMass = bladeMass;
        this.rockMovementDistance = rockMovementDistance;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public double getBladeMass() {
        return bladeMass;
    }

    public void setBladeMass(double bladeMass) {
        this.bladeMass = bladeMass;
    }

    public double getRockMovementDistance() {
        return rockMovementDistance;
    }

    public void setRockMovementDistance(double rockMovementDistance) {
        this.rockMovementDistance = rockMovementDistance;
    }
}
