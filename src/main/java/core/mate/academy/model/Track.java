package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String model;
    private String typeOfFuel;
    private int weight;

    public Track(String model, String typeOfFuel, int weight) {
        this.model = model;
        this.typeOfFuel = typeOfFuel;
        this.weight = weight;
    }

    public Track() {
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
