package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int wheelsNumber;
    private float maxWeightCargo;

    public Track() {

    }

    public Track(int wheelsNumber, float maxWeightCargo, String name, String color) {
        this.wheelsNumber = wheelsNumber;
        this.maxWeightCargo = maxWeightCargo;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
