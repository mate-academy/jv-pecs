package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private int maxSpeed;
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(int horsePower, int maxSpeed, String model) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
