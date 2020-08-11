package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String typeOfFuel;
    private String size;

    public Track() {
    }

    public Track(String typeOfFuel, String size) {
        this.typeOfFuel = typeOfFuel;
        this.size = size;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
