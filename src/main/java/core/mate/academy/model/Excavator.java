package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weight;
    private String manufacture;

    public Excavator() {
    }

    public Excavator(int weight, String manufacture) {
        this.weight = weight;
        this.manufacture = manufacture;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
