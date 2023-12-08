package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int horsePower;
    private String typeOfWheels;

    public Excavator() {
    }

    public Excavator(int horsePower, String typeOfWheels) {
        this.horsePower = horsePower;
        this.typeOfWheels = typeOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getTypeOfWheels() {
        return typeOfWheels;
    }

    public void setTypeOfWheels(String typeOfWheels) {
        this.typeOfWheels = typeOfWheels;
    }
}
