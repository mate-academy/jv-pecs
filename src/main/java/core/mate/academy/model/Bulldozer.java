package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;
    private String production;

    public Bulldozer() {
    }

    public Bulldozer(int power, String production) {
        this.power = power;
        this.production = production;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public void displayInfo() {
        System.out.println("Bulldozer {"
                + "name = " + getName() + ", production = " + production + ", power = " + power
                + ", color = " + getColor() + " }");
    }
}
