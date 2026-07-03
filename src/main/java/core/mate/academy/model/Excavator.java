package core.mate.academy.model;

/*
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {
    private String brand;
    private int power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}

