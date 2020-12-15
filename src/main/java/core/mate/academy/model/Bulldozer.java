package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeOfMovement;
    private int numberOfParkingPlace;

    public Bulldozer() {

    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }

    public void setNumberOfParkingPlace(int numberOfParkingPlace) {
        this.numberOfParkingPlace = numberOfParkingPlace;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
