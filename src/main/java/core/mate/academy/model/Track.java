package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int loadCapacity;
    private int numberOfGears;
    private boolean isElectric;

    public Track(String name, String colour,
                 int loadCapacity, int numberOfGears, boolean isElectric) {
        setName(name);
        setColor(colour);
        this.loadCapacity = loadCapacity;
        this.numberOfGears = numberOfGears;
        this.isElectric = isElectric;
    }

    public Track() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
