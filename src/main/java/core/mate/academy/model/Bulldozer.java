package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;
    private String typeOfFuel;

    public Bulldozer() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
