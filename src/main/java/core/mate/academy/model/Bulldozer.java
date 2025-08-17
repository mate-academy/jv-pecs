package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double visorLength;
    private boolean withCaterpillar;

    public Bulldozer() {
    }

    public Bulldozer(double visorLength, boolean withCaterpillar) {
        this.visorLength = visorLength;
        this.withCaterpillar = withCaterpillar;
    }

    public double getVisorLength() {
        return visorLength;
    }

    public void setVisorLength(double visorLength) {
        this.visorLength = visorLength;
    }

    public boolean isWithCaterpillar() {
        return withCaterpillar;
    }

    public void setWithCaterpillar(boolean withCaterpillar) {
        this.withCaterpillar = withCaterpillar;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
