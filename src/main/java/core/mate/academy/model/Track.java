package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {

    private int power;
    private int weight;

    public Track() {

    }

    public Track(int power, int weight) {
        this.power = power;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
