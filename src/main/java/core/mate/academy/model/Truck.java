package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int horsePower;
    private String nameOfBulldozer;

    public Truck() {
    }

    public Truck(int horsePower, String nameOfBulldozer) {
        this.horsePower = horsePower;
        this.nameOfBulldozer = nameOfBulldozer;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getNameOfBulldozer() {
        return nameOfBulldozer;
    }

    public void setNameOfBulldozer(String nameOfBulldozer) {
        this.nameOfBulldozer = nameOfBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
