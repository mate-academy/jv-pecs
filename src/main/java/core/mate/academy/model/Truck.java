package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int payload;
    private String option;

    public Truck() {
    }

    public Truck(String name, String color, int payload, String option) {
        this.setName(name);
        this.setColor(color);
        this.payload = payload;
        this.option = option;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck[name= " + getName() + ", color= " + getColor()
                + ", payload= " + getPayload() + ", option= " + getOption() + "]";
    }
}
