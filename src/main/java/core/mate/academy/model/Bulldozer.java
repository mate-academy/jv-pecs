package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeDimensions;
    private String tractionClass;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double bladeDimensions, String tractionClass) {
        super(name, color);
        this.bladeDimensions = bladeDimensions;
        this.tractionClass = tractionClass;
    }

    public void setBladeDimensions(double bladeDimensions) {
        this.bladeDimensions = bladeDimensions;
    }

    public void setTractionClass(String tractionClass) {
        this.tractionClass = tractionClass;
    }

    public double getBladeDimensions() {
        return bladeDimensions;
    }

    public String getTractionClass() {
        return tractionClass;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
