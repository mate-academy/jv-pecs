package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int yearMade;
    private String typeOfPetrol;

    public Track() {
    }

    public Track(int yearMade, String typeOfPetrol) {
        this.yearMade = yearMade;
        this.typeOfPetrol = typeOfPetrol;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
