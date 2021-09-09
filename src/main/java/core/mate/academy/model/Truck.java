package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numbersOfGears;

    public Truck() {
    }

    public Truck(int numbersOfGears, String name, String color) {
        this.numbersOfGears = numbersOfGears;
        setName(name);
        setColor(color);
    }

    public int getNumbersOfGears() {
        return numbersOfGears;
    }

    public void setNumbersOfGears(int numbersOfGears) {
        this.numbersOfGears = numbersOfGears;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
