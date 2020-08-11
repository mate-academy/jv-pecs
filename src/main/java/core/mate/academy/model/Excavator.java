package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int vinCode;
    private int power;
    private String fuel;

    public Excavator() {
    }

    public Excavator(int vinCode, int power, String fuel) {
        this.vinCode = vinCode;
        this.power = power;
        this.fuel = fuel;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getVinCode() {
        return vinCode;
    }

    public void setVinCode(int vinCode) {
        this.vinCode = vinCode;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
