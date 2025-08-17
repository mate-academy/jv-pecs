package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int id;
    private String model;
    private int maximumPayload;

    public Truck() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaximumPayload() {
        return maximumPayload;
    }

    public void setMaximumPayload(int maximumPayload) {
        this.maximumPayload = maximumPayload;
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + id + " started to work");
    }
}
