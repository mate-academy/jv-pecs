package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeOfBoard;

    public Truck(){

    }

    public Truck(String name, String color, int power, String typeOfBoard) {
        super(name, color, power);
        this.typeOfBoard = typeOfBoard;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
