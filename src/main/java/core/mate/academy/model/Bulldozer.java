package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeOfBlade;
    private int numberOfTracks;

    public Bulldozer() {
    }

    public Bulldozer(String typeOfBlade, int numberOfTracks) {
        this.typeOfBlade = typeOfBlade;
        this.numberOfTracks = numberOfTracks;
    }

    private String getTypeOfBlade() {
        return typeOfBlade;
    }

    private void setTypeOfBlade(String typeOfBlade) {
        this.typeOfBlade = typeOfBlade;
    }

    private int getNumberOfTracks() {
        return numberOfTracks;
    }

    private void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
