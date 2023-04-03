package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String function;
    private double littersPerHour;

    public Bulldozer() {
    }

    public Bulldozer(String function, double littersPerHour) {
        this.function = function;
        this.littersPerHour = littersPerHour;
    }

    @Override
    public String getFunction() {
        return function;
    }

    @Override
    public void setFunction(String function) {
        this.function = function;
    }

    public double getLittersPerHour() {
        return littersPerHour;
    }

    public void setLittersPerHour(double littersPerHour) {
        this.littersPerHour = littersPerHour;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work.");
    }
}
