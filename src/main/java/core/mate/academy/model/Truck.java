package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeOfBoard;

    public Truck(){

    }

    public String getTypeOfBoard() {
        return typeOfBoard;
    }

    public void setTypeOfBoard(String typeOfBoard) {
        this.typeOfBoard = typeOfBoard;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
