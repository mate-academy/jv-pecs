package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String brand;
    private String motorType;

    public Excavator(String brand, String motorType) {
        this.brand = brand;
        this.motorType = motorType;
    }

    public Excavator() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getBrand() {
        return brand;
    }

    public String getMotorType() {
        return motorType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
