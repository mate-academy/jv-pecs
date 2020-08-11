package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int power;
    private String production;

    public Track() {
    }

    public Track(int power, String production) {
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
        System.out.println("Track started to work");
    }

    @Override
    public void displayInfo() {
        System.out.println("Track {"
                + "name = " + getName() + ", production = " + production + ", power = " + power
                + ", color = " + getColor() + " }");
    }
}
